package predictor;

import antlrgen.SimpleSpeakQlParser;
import com.vmware.antlr4c3.CodeCompletionCore;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class NextWordsPredictor {
    public static ArrayList<String> getNextWords(
            String query, HashSet<Integer> ruleSet, HashSet<Integer> ignoredTokens, String startRule
    ) {

        query = query.replace("__SCHROD", "").strip() + " __SCHROD";
        query = query.toUpperCase(Locale.ROOT);

        ParserPackage parserPackage;
        ParserRuleContext context;

        if (startRule.equals("SELECT")) {
            parserPackage = new SelectExpressionRuleParserPackage(query);
        } else if (startRule.equals("TABLE")) {
            parserPackage = new TableExpressionRuleParserPackage(query);
        } else if (startRule.equals("WHERE")) {
            parserPackage = new WhereExpressionRuleParserPackage(query);
        } else if (startRule.equals("MODIFIER")) {
            parserPackage = new SelectModifierExpressionRuleParserPackage(query);
        } else {
            parserPackage = new StartRuleParserPackage(query);
        }

        context = parserPackage.getTree();
        SimpleSpeakQlParser parser = parserPackage.getParser();
        CommonTokenStream tokens = parserPackage.getTokens();

        CodeCompletionCore core = new CodeCompletionCore(parser, ruleSet, ignoredTokens);

        int caretPosition = tokens.getTokens().size() - 2;

//        System.out.println(query);
//        System.out.println(tokens.getTokens());
//        System.out.println(caretPosition);

        CodeCompletionCore.CandidatesCollection collection
                = core.collectCandidates(caretPosition, context);

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
}
