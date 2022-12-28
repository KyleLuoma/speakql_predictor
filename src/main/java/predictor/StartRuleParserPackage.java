package predictor;

import antlrgen.SimpleSpeakQlLexer;
import antlrgen.SimpleSpeakQlParser;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

public class StartRuleParserPackage extends ParserPackage{

    public StartRuleParserPackage(String query) {
        this.updateWithNewQuery(query);
    }

    public ParserRuleContext generateTree() {
        return parser.start();
    }
}
