package org.example;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

public final class EasyScriptSumFunctionNode extends EasyScriptNode {
    @Children private final EasyScriptNode[] argumentNodes;

    public EasyScriptSumFunctionNode(EasyScriptNode[] argumentNodes) {
        this.argumentNodes = argumentNodes;
    }

    @Override
    public int executeInt(VirtualFrame frame) {
        int sum = 0;
        for (EasyScriptNode arg : argumentNodes) {
            try {
                sum += arg.executeInt(frame);
            } catch (UnexpectedResultException e) {
                throw new RuntimeException("Non-integer argument to sum()");
            }
        }
        return sum;
    }

    @Override
    public double executeDouble(VirtualFrame frame) {
        return executeInt(frame); // or handle doubles
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeInt(frame);
    }
}
