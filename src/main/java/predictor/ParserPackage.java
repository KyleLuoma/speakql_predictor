package predictor;

import antlrgen.SimpleSpeakQlLexer;
import antlrgen.SimpleSpeakQlParser;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class ParserPackage {

    SimpleSpeakQlLexer lexer;
    CommonTokenStream tokens;
    SimpleSpeakQlParser parser;
    String query;
    SimpleSpeakQlParser.StartContext tree;

    public ParserPackage(String query) {
        this.updateWithNewQuery(query);
    }

    public void updateWithNewQuery(String query) {
        this.query = query;
        this.lexer = new SimpleSpeakQlLexer(CharStreams.fromString(query));
        this.tokens = new CommonTokenStream(this.lexer);
        this.parser = new SimpleSpeakQlParser(this.tokens);
        this.lexer.removeErrorListeners();
        this.parser.removeErrorListeners();
        BaseErrorListener errorListener = new BaseErrorListener();
        parser.addErrorListener(errorListener);
        this.lexer.reset();
        this.tree = parser.start();
    }

    public SimpleSpeakQlLexer getLexer() {
        return lexer;
    }

    public CommonTokenStream getTokens() {
        return tokens;
    }

    public SimpleSpeakQlParser getParser() {
        return parser;
    }

    public String getQuery() {
        return query;
    }

    public SimpleSpeakQlParser.StartContext getTree() {
        return tree;
    }
}
