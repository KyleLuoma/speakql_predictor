import antlrgen.SimpleSpeakQlParser;
import com.vmware.antlr4c3.CodeCompletionCore;
import dag.DagNode;
import org.antlr.v4.runtime.*;
import predictor.ParserPackage;

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
        Boolean makeTrie = true;
        Boolean predict = false;

        for(int arg = 0; arg < args.length; arg++) {
            if(args[arg].toUpperCase(Locale.ROOT).equals("-PREDICT")) {
                asrQuery = args[arg + 1];
                predict = true;
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-TRIE")) {
                makeTrie = true;
                asrQuery = args[arg + 1];
            }
            if(args[arg].toUpperCase(Locale.ROOT).equals("-FILENAME")) {
                outputFileName = args[arg + 1];
            }
        }

        if(asrQuery.length() == 0) {//Get a raw asr-based query:
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
            //delimRuleSet.add(SimpleSpeakQlParser.RULE_selectKeyword);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_subQueryTable);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_expression);
        }

        //Level 3 delimiter rules:
        if(includeL3DelimRules) {
            delimRuleSet.add(SimpleSpeakQlParser.RULE_selectElementDelimiter);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_tableSourceDelimiter);
            delimRuleSet.add(SimpleSpeakQlParser.RULE_groupByItemDelimiter);
        }

        if(predict) {
            ArrayList<String> nextWords = getNextWords(asrQuery, idRuleSet, null);
            printNextWordsAsArray(nextWords);
        }

        if(makeTrie) {
            HashSet<String> stringRuleSet = new HashSet<>();
            writeTrieFile(
                    asrQuery + " __SCHROD",
                    delimRuleSet,
                    idRuleSet,
                    0,
                    30,
                    stringRuleSet,
                    "JOIN"
            );
        }

    }

    public static String printNextWordsAsArray(ArrayList<String> nextWords) {
        Iterator<String> iter = nextWords.iterator();
        String output = "[";
        while (iter.hasNext()) {
            output = output + iter.next();
            if (iter.hasNext()) {
                output = output + ", ";
            }
        }
        output = output + "]";
        System.out.println(output);
        return output;
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

    public static ArrayList<String> getNextWords(
            String query, HashSet<Integer> ruleSet, HashSet<Integer> ignoredTokens
    ) {

        query = query.replace("__SCHROD", "").strip() + " __SCHROD";
        query = query.toUpperCase(Locale.ROOT);

        ParserPackage parserPackage = new ParserPackage(query);
        SimpleSpeakQlParser parser = parserPackage.getParser();
        CommonTokenStream tokens = parserPackage.getTokens();

        CodeCompletionCore core = new CodeCompletionCore(parser, ruleSet, ignoredTokens);

        int caretPosition = tokens.getTokens().size() - 2;

//        System.out.println(query);
//        System.out.println(tokens.getTokens());
//        System.out.println(caretPosition);

        CodeCompletionCore.CandidatesCollection collection
                = core.collectCandidates(caretPosition, null);

        ArrayList<String> nextWords = new ArrayList<>();

        Set<Integer> ruleKeys = collection.rules.keySet();
        Iterator<Integer> ruleKeyIter = ruleKeys.iterator();
        while(ruleKeyIter.hasNext()) {
            nextWords.add(parser.getRuleNames()[ruleKeyIter.next()]);
        }

        Set<Integer> keys = collection.tokens.keySet();
        Iterator<Integer> keyIter = keys.iterator();
        while(keyIter.hasNext()) {
            nextWords.add(parser.getVocabulary().getDisplayName(keyIter.next()));
        }

        return nextWords;
    }

    public static void printNextRulesForQuery(String query, HashSet<Integer> ruleSet) {
        ParserPackage parserPackage = new ParserPackage(query);
        SimpleSpeakQlParser parser = parserPackage.getParser();
        CommonTokenStream tokens = parserPackage.getTokens();

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

        ParserPackage parserPackage = new ParserPackage(query);
        SimpleSpeakQlParser parser = parserPackage.getParser();
        CommonTokenStream tokens = parserPackage.getTokens();

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

        CodeCompletionCore core = new CodeCompletionCore(parser, ruleSet, null);
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
            else if (depth < 10){
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
            if(query.contains(token)) {
                continue;
            }
            String newQuery = query.replace("__SCHROD", "") + " " + token + " __SCHROD";
            //writeStringToFile("./allpossiblequeries.spql", newQuery.replace("__SCHROD", ""));
            System.out.println(newQuery);
            writeTrieFile(newQuery,delimRuleSet,idRuleSet,depth,maxDepth,stringExcludeRuleSet, removeFromOutput);
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
