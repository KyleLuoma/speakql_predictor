package predictor;

import antlrgen.SimpleSpeakQlParser;
import antlrgen.SimpleSpeakQlParserBaseVisitor;
import com.vmware.antlr4c3.CodeCompletionCore;

public class VisitorAnnouncer extends SimpleSpeakQlParserBaseVisitor {

    CodeCompletionCore predictor;

    public VisitorAnnouncer(CodeCompletionCore predictor) {
        this.predictor = predictor;
    }

    public String visitSimpleSelect(
            SimpleSpeakQlParser.SimpleSelectContext ctx
    ) {
        System.out.println(predictor.collectCandidates(ctx.getRuleIndex(), ctx));
        return "";
    }
}
