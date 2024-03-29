import antlrgen.SimpleSpeakQlParser;
import com.vmware.antlr4c3.CodeCompletionCore;
import org.antlr.v4.runtime.*;
import predictor.*;
import server.PredictorServer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String args[]) throws FileNotFoundException {

        String asrQuery = "";
        String outputFileName = "output.txt";

        Boolean includeL1DelimRules = true;
        Boolean includeL2DelimRules = true;
        Boolean includeL3DelimRules = true;
        Boolean makeTrie = false;
        Boolean predict = false;
        Boolean predictSelectExpression = false;
        Boolean predictWhereExpression = false;
        Boolean predictTableExpression = false;
        Boolean predictSelectModifierExpression = false;
        Boolean tokenize = false;
        Boolean parseQuery = false;
        Boolean doServer = false;
        Boolean parseSelectExpression = false;
        Boolean parseWhereExpression = false;
        Boolean parseTableExpression = false;
        Boolean parseSelectModifierExpression = false;

        for(int arg = 0; arg < args.length; arg++) {
            if(args[arg].toUpperCase(Locale.ROOT).equals("-PREDICT")) {
                asrQuery = args[arg + 1];
                predict = true;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-PREDICT-SELECT")) {
                asrQuery = args[arg + 1];
                predictSelectExpression = true;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-PREDICT-WHERE")) {
                asrQuery = args[arg + 1];
                predictWhereExpression = true;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-PREDICT-TABLE")) {
                asrQuery = args[arg + 1];
                predictTableExpression = true;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-PREDICT-MODIFIER")) {
                asrQuery = args[arg + 1];
                predictSelectModifierExpression = true;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-TRIE")) {
                makeTrie = true;
                asrQuery = args[arg + 1];
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-FILENAME")) {
                outputFileName = args[arg + 1];
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-TOKENIZE")) {
                asrQuery = args[arg + 1];
                tokenize = true;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-PARSE")) {
                asrQuery = args[arg + 1];
                parseQuery = true;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-PARSE-SELECT")) {
                asrQuery = args[arg + 1];
                parseSelectExpression = true;
                parseQuery = false;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-PARSE-TABLE")) {
                asrQuery = args[arg + 1];
                parseTableExpression = true;
                parseQuery = false;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-PARSE-WHERE")) {
                asrQuery = args[arg + 1];
                parseWhereExpression = true;
                parseQuery = false;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-PARSE-MODIFIER")) {
                asrQuery = args[arg + 1];
                parseSelectModifierExpression = true;
                parseQuery = false;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-SERVER")) {
                doServer = true;
            }
        }

        if(asrQuery.length() == 0 && !doServer) {//Get a raw asr-based query:
            String queryFileName = "query.spql";
            asrQuery = getQueryFromFile(queryFileName, false);
        }

        HashSet<Integer> idRuleSet = new HashSet<Integer>();

        //idRuleSet.add(SimpleSpeakQlParser.RULE_tableName);
        //idRuleSet.add(SimpleSpeakQlParser.RULE_tableAlias);
        idRuleSet.add(SimpleSpeakQlParser.RULE_simpleId);
        idRuleSet.add(SimpleSpeakQlParser.RULE_uid);
        idRuleSet.add(SimpleSpeakQlParser.RULE_constant);

        //ruleSet.add(SimpleSpeakQlParser.RULE_subQueryTable);

        HashSet<Integer> delimRuleSet = new HashSet<>();

        //Level 1 delimiter rule:
        if(includeL1DelimRules) {
            delimRuleSet.add(SimpleSpeakQlParser.RULE_expressionDelimiter);
        }

        //Level 2 delimiter rule:
        if(includeL2DelimRules) {
            delimRuleSet.add(SimpleSpeakQlParser.RULE_whereKeyword);
            //delimRuleSet.add(SimpleSpeakQlParser.RULE_fromKeyword);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_joinKeyword);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_joinDirection);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_innerJoinKeyword);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_outerJoinKeyword);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_naturalJoinKeyword);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_selectKeyword);
            //delimRuleSet.add(SimpleSpeakQlParser.RULE_onKeyword);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_subQueryTable);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_expression);
            //delimRuleSet.add(SimpleSpeakQlParser.RULE_logicalOperator);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_groupByKeyword);
            //delimRuleSet.add(SimpleSpeakQlParser.RULE_selectModifierExpression);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_havingKeyword);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_limitClause);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_orderByClause);
        }

        //Level 3 delimiter rules:
        if(includeL3DelimRules) {
            delimRuleSet.add(SimpleSpeakQlParser.RULE_selectElementDelimiter);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_tableSourceDelimiter);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_groupByItemDelimiter);
        }

        if(predict || predictSelectExpression || predictTableExpression || predictWhereExpression || predictSelectModifierExpression) {
            String rule = "START";
            if(predictSelectExpression) {
                rule = "SELECT";
            } else if(predictTableExpression) {
                rule = "TABLE";
            } else if(predictWhereExpression) {
                rule = "WHERE";
            } else if(predictSelectModifierExpression) {
                rule = "MODIFIER";
            }
            ArrayList<String> nextWords = NextWordsPredictor.getNextWords(asrQuery, idRuleSet, null, rule);
            NextWordsPredictor.printNextWordsAsArray(nextWords);
        }

        if(makeTrie) {
            HashSet<String> stringRuleSet = new HashSet<>();
            writeTrieFile(
                    asrQuery + " __SCHROD",
                    delimRuleSet,
                    idRuleSet,
                    0,
                    40,
                    stringRuleSet,
                    "FROM BUILDING JOIN TABLE"
            );
        }

        if(tokenize){
            printLexerTokensAsArray(asrQuery);
        }

        if(parseQuery){
            StartRuleParserPackage startRuleParserPackage = new StartRuleParserPackage(asrQuery);
            String stringTree = startRuleParserPackage.getTree().toStringTree(startRuleParserPackage.getParser());
            System.out.println(stringTree);
        }

        if(parseSelectExpression || parseTableExpression || parseWhereExpression || parseSelectModifierExpression) {
            ParserPackage parserPackage = new ParserPackage() {
                @Override
                public ParserRuleContext generateTree() {
                    return null;
                }
            };
            if(parseSelectExpression) {
                parserPackage = new SelectExpressionRuleParserPackage(asrQuery);
            } else if (parseTableExpression) {
                parserPackage = new TableExpressionRuleParserPackage(asrQuery);
            } else if (parseWhereExpression) {
                parserPackage = new WhereExpressionRuleParserPackage(asrQuery);
            } else if (parseSelectModifierExpression) {
                parserPackage = new SelectModifierExpressionRuleParserPackage(asrQuery);
            }
            String stringTree = parserPackage.getTree().toStringTree(
                    parserPackage.getParser()
            );
            System.out.println(stringTree);
        }


        if(doServer){
            PredictorServer predictorServer = new PredictorServer();
            try {
                predictorServer.run();
            } catch(Exception e) {
                System.out.println((e));
            }
        }
    }

    public static String printLexerTokensAsArray(String query) {
        StartRuleParserPackage startRuleParserPackage = new StartRuleParserPackage(query);
        CommonTokenStream tokens = startRuleParserPackage.getTokens();
        List<Token> tokensList = tokens.getTokens();
        StringBuilder stringBuilder = new StringBuilder();
        for(Token token : tokensList) {
            if(! token.getText().equals(" ")) {
                stringBuilder.append("\"" + token.getText() + "\"" + ", ");
            }
        }
        String tokenString = stringBuilder.toString().replace(", \"<EOF>\",", "");
        System.out.println("[ " + tokenString + " ]");
        return tokenString;
    }

    public static String getQueryFromFile(String fileName, Boolean verbose) throws FileNotFoundException {
        String asrQuery = "";
        String queryFileName = fileName;

        File file = new File("./" + queryFileName);
        Scanner fileReader = new Scanner(file);

        while(fileReader.hasNextLine()) {
            asrQuery = asrQuery + fileReader.nextLine().strip() + " ";
        }

        fileReader.close();
        if(verbose) {
            System.out.println("MAIN: Read query " + asrQuery + " from " + queryFileName);
        }
        return asrQuery.toUpperCase(Locale.ROOT);
    }

    public static void printNextRulesForQuery(String query, HashSet<Integer> ruleSet) {
        StartRuleParserPackage startRuleParserPackage = new StartRuleParserPackage(query);
        SimpleSpeakQlParser parser = startRuleParserPackage.getParser();
        CommonTokenStream tokens = startRuleParserPackage.getTokens();

        //Specify entry point
        SimpleSpeakQlParser.StartContext tree = parser.start();

        System.out.println(tree.toStringTree(parser));

        CodeCompletionCore core = new CodeCompletionCore(parser, ruleSet, null);

        //lexer.reset();
        System.out.println(tokens.getTokens());
        System.out.println("CaretTokenIndex position: " + (tokens.getTokens().size() - 3));
        CodeCompletionCore.CandidatesCollection collection = core.collectCandidates(tokens.getTokens().size() - 3, null);

        Set<Integer> keys = collection.tokens.keySet();
        Iterator<Integer> keyIter = keys.iterator();
        while(keyIter.hasNext()) {
            System.out.println(parser.getVocabulary().getDisplayName(keyIter.next()));
        }
        Set<Integer> ruleKeys = collection.rules.keySet();
        Iterator<Integer> ruleKeyIter = ruleKeys.iterator();
        while(ruleKeyIter.hasNext()) {
            System.out.println(parser.getRuleNames()[ruleKeyIter.next()]);
        }
    }

    public static void writeTrieFile(
            String query,
            Set<Integer> delimRuleSet,
            Set<Integer> idRuleSet,
            Integer depth,
            Integer maxDepth,
            Set<String> stringExcludeRuleSet,
            String removeFromOutput
    ) {

        depth++;

        query = query.replace("'", "").strip();

        StartRuleParserPackage startRuleParserPackage = new StartRuleParserPackage(query);
        SimpleSpeakQlParser parser = startRuleParserPackage.getParser();
        CommonTokenStream tokens = startRuleParserPackage.getTokens();

        HashSet<Integer> ruleSet = new HashSet<>();
        ruleSet.addAll(delimRuleSet);
        ruleSet.addAll(idRuleSet);

        //Add delim rule strings to stringRuleSet for filtering
        if (stringExcludeRuleSet.size() == 0) {
            Iterator<Integer> rsIter = delimRuleSet.iterator();
            while(rsIter.hasNext()) {
                stringExcludeRuleSet.add(
                        parser.getRuleNames()[rsIter.next()].replace("'", "").strip()
                );
            }
        }

        HashSet<Integer> ignoreTokens = new HashSet<>();
        ignoreTokens.add(startRuleParserPackage.getLexer().getTokenType("END_OF_FILE"));
        ignoreTokens.add(startRuleParserPackage.getLexer().getTokenType("<EOF>"));
        ignoreTokens.add(startRuleParserPackage.getLexer().getTokenType("-2"));

        CodeCompletionCore core = new CodeCompletionCore(parser, ruleSet, ignoreTokens);
        CodeCompletionCore.CandidatesCollection collection = core.collectCandidates(tokens.getTokens().size() - 3, null);

        Set<Integer> ruleKeys = collection.rules.keySet();
        Iterator<Integer> ruleKeyIter = ruleKeys.iterator();
        while(ruleKeyIter.hasNext()) {
            String rule = parser.getRuleNames()[ruleKeyIter.next()].replace("'", "").strip();
            if(stringExcludeRuleSet.contains(rule)) {
                writeStringToFile(
                        "./allpossiblequeries.spql",
                        query.replace("__SCHROD", "").replace(removeFromOutput, "").strip()
                );
                continue;
            }
//            else if (rule.equals("-2")) {
//                continue;
//            }
            else if (depth < 16){
                String newQuery = query.replace("__SCHROD", "") + rule + "_x __SCHROD";
                //writeStringToFile("./allpossiblequeries.spql", newQuery.replace("__SCHROD", ""));
                System.out.println(newQuery);
                writeTrieFile(newQuery, delimRuleSet, idRuleSet, depth, maxDepth, stringExcludeRuleSet, removeFromOutput);
            }
        }

        Set<Integer> keys = collection.tokens.keySet();

        Iterator<Integer> keyIter = keys.iterator();
        while(keyIter.hasNext()) {
            String token = parser.getVocabulary().getDisplayName(keyIter.next()).replace("'", "").strip();
            if(query.contains(token) || token.equals("-2")) {
                continue;
            }
            else if (depth < 16) {
                String newQuery = query.replace("__SCHROD", "") + " " + token + " __SCHROD";
                //writeStringToFile("./allpossiblequeries.spql", newQuery.replace("__SCHROD", ""));
                System.out.println(newQuery);
                writeTrieFile(newQuery, delimRuleSet, idRuleSet, depth, maxDepth, stringExcludeRuleSet, removeFromOutput);
            }
        }
    }

    public static void writeStringToFile(String filePath, String output) {
        try{
            File file = new File(filePath);
            file.createNewFile();
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(output + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
