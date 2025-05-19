package org.example;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.TruffleLanguage;

@TruffleLanguage.Registration(id = "ezs", name = "EasyScript",
        version = "0.1" , defaultMimeType = "application/x-sl",
        characterMimeTypes = "application/x-sl", contextPolicy = TruffleLanguage.ContextPolicy.SHARED
        ,website = "https://www.graalvm.org/graalvm-as-a-platform/implement-language/")
public final class EasyScriptTruffleLanguage extends TruffleLanguage<Void> {
    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        EasyScriptNode exprNode = EasyScriptTruffleParser.parse(request.getSource().getReader());
        var rootNode = new EasyScriptRootNode(exprNode);
        return rootNode.getCallTarget();
    }

    @Override
    protected Void createContext(Env env) {
        return null;
    }
}
