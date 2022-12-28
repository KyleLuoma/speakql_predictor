package predictor;

import antlrgen.SimpleSpeakQlLexer;
import antlrgen.SimpleSpeakQlParser;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

public abstract class ParserPackage {

    SimpleSpeakQlLexer lexer;
    CommonTokenStream tokens;
    SimpleSpeakQlParser parser;
    String query;
    ParserRuleContext tree;

    public abstract ParserRuleContext generateTree();

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
        this.tree = this.generateTree();
    };
    public SimpleSpeakQlLexer getLexer() {
        return this.lexer;
    }
    public CommonTokenStream getTokens() {
        return this.tokens;
    }
    public SimpleSpeakQlParser getParser() {
        return this.parser;
    }
    public String getQuery() {
        return this.query;
    }
    public ParserRuleContext getTree() {
        return tree;
    }

}
