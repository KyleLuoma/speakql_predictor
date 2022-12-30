package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashSet;

import antlrgen.SimpleSpeakQlParser;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import predictor.NextWordsPredictor;
import predictor.StartRuleParserPackage;
import util.SimpleJsonStringParser;


//https://stackoverflow.com/questions/3732109/simple-http-server-in-java-using-only-java-se-api
public class PredictorServer {

    public void run() throws Exception {
        int port = 6789;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/parse/full", new ParseFullRequestHandler());
        server.createContext("/predict", new PredictRequestHandler());
        server.createContext("/kill", new KillRequestHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("SpeakQL Predictor server running on port " + port);
    }

    static class KillRequestHandler implements  HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            System.out.println("Terminating SpeakQL Predictor server due to call to kill endpoint!");
            System.exit(0);
            String response = "He is dead, Jim";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    static class PredictRequestHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            InputStream is = t.getRequestBody();
            StringBuilder requestBodySB = new StringBuilder();
            int i;
            while ((i = is.read()) != -1) {
                requestBodySB.append((char) i);
            }

            System.out.println(requestBodySB.toString());

            String query = null;
            String rule = null;
            try {
                query = SimpleJsonStringParser.getValueFromJsonString("query", requestBodySB.toString());
                rule = SimpleJsonStringParser.getValueFromJsonString("rule", requestBodySB.toString());
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

            System.out.println("Rule: " + rule + " Query: " + query);

            HashSet<Integer> idRuleSet = new HashSet<Integer>();
            idRuleSet.add(SimpleSpeakQlParser.RULE_simpleId);
            idRuleSet.add(SimpleSpeakQlParser.RULE_uid);
            idRuleSet.add(SimpleSpeakQlParser.RULE_constant);

            ArrayList<String> nextWords = NextWordsPredictor.getNextWords(
                    query, idRuleSet, null, rule
            );
            String response = NextWordsPredictor.printNextWordsAsArray(nextWords);
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    static class ParseFullRequestHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            //Get request body
            InputStream is = t.getRequestBody();
            StringBuilder requestBodySB = new StringBuilder();
            int i;
            while ((i = is.read()) != -1) {
                requestBodySB.append((char) i);
            }
            System.out.println(requestBodySB.toString());
            //Parse request query
            StartRuleParserPackage startRuleParserPackage = new StartRuleParserPackage(requestBodySB.toString());
            String response = startRuleParserPackage.getTree().toStringTree(startRuleParserPackage.getParser());

            //Return parse tree
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
