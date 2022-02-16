import antlrgen.SimpleSpeakQlLexer;
import antlrgen.SimpleSpeakQlParser;
import com.vmware.antlr4c3.CodeCompletionCore;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import predictor.VisitorAnnouncer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String args[]) throws FileNotFoundException {

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        String query = "";
        String queryFileName = "";
        if(args.length > 0){
            queryFileName = args[0];
            query = "";
        }
        else {
            queryFileName = "query.spql";
        }
        File file = new File("./" + queryFileName);
        Scanner fileReader = new Scanner(file);
        while(fileReader.hasNextLine()) {
            query = query + fileReader.nextLine().strip() + " ";
        }
        fileReader.close();
        System.out.println("MAIN: Read query " + query + " from " + queryFileName);

        SimpleSpeakQlLexer lexer = new SimpleSpeakQlLexer(CharStreams.fromString(query));
        System.out.println(lexer.getAllTokens());
        lexer.reset();
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        System.out.println(tokens.getNumberOfOnChannelTokens());

        SimpleSpeakQlParser parser = new SimpleSpeakQlParser(tokens);

        lexer.removeErrorListeners();
        parser.removeErrorListeners();

        BaseErrorListener errorListener = new BaseErrorListener();
        parser.addErrorListener(errorListener);

        //Specify entry point
        SimpleSpeakQlParser.StartContext tree = parser.start();

        System.out.println(tree.toStringTree(parser));

        HashSet<Integer> ruleSet = new HashSet<Integer>();

        ruleSet.add(SimpleSpeakQlParser.RULE_selectKeyword);
        ruleSet.add(SimpleSpeakQlParser.RULE_fromKeyword);
        ruleSet.add(SimpleSpeakQlParser.RULE_joinKeyword);
        ruleSet.add(SimpleSpeakQlParser.RULE_onKeyword);
        ruleSet.add(SimpleSpeakQlParser.RULE_nothingElement);
        ruleSet.add(SimpleSpeakQlParser.RULE_groupByKeyword);
        ruleSet.add(SimpleSpeakQlParser.RULE_innerJoinKeyword);
        ruleSet.add(SimpleSpeakQlParser.RULE_leftParen);
        ruleSet.add(SimpleSpeakQlParser.RULE_rightParen);
        ruleSet.add(SimpleSpeakQlParser.RULE_joinDirection);
        ruleSet.add(SimpleSpeakQlParser.RULE_naturalJoinKeyword);
        ruleSet.add(SimpleSpeakQlParser.RULE_theKeyword);
        ruleSet.add(SimpleSpeakQlParser.RULE_tableName);
        ruleSet.add(SimpleSpeakQlParser.RULE_tableKeyword);
        ruleSet.add(SimpleSpeakQlParser.RULE_tableAlias);
        ruleSet.add(SimpleSpeakQlParser.RULE_simpleId);
        ruleSet.add(SimpleSpeakQlParser.RULE_aggregateWindowedFunction);
        ruleSet.add(SimpleSpeakQlParser.RULE_selectElement);
        ruleSet.add(SimpleSpeakQlParser.RULE_expressionDelimiter);
        ruleSet.add(SimpleSpeakQlParser.RULE_tableSourceDelimiter);
        ruleSet.add(SimpleSpeakQlParser.RULE_whereKeyword);


        CodeCompletionCore core = new CodeCompletionCore(parser, ruleSet, null);
        System.out.println(tokens.getTokens());
        lexer.reset();
        System.out.println("CaretTokenIndex position: " + (tokens.getTokens().size() - 3));
        CodeCompletionCore.CandidatesCollection collection = core.collectCandidates(tokens.getTokens().size() - 3, null);

//        Set<Integer> keys = collection.tokens.keySet();
//        Iterator<Integer> keyIter = keys.iterator();
//        while(keyIter.hasNext()) {
//            System.out.println(parser.getVocabulary().getDisplayName(keyIter.next()));
//        }
        Set<Integer> ruleKeys = collection.rules.keySet();
        Iterator<Integer> ruleKeyIter = ruleKeys.iterator();
        while(ruleKeyIter.hasNext()) {
            System.out.println(parser.getRuleNames()[ruleKeyIter.next()]);
        }
    }

}
