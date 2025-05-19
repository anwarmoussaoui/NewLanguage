package org.example;

import com.oracle.truffle.api.CallTarget;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Context context = Context.create();
        Value result = context.eval("ezs",
                "10 + 24 + 56.0");
        System.out.println(result);
    }
}