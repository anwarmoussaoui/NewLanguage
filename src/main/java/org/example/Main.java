package org.example;

import com.oracle.truffle.api.CallTarget;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class Main {
    public static void main(String[] args) {
        try {
            Context context = Context.create();

            Value result = context.eval("ezs",
                    "10 + 24 + 56");
            System.out.println(result);
        }catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
    }
}