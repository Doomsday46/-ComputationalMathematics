package com.example;

public class CombinedRootSearchMethod implements RootSearchMethod {
    @Override
    public Double findRoot(Double a, Double b, Functions curFunction, Double eps) {
        Double c = null;
        do{
        c =(curFunction.functionEvaluation(b)*a-curFunction.functionEvaluation(a)*b)/(curFunction.functionEvaluation(b)-curFunction.functionEvaluation(a));
        if (curFunction.functionEvaluation(a)*curFunction.functionEvaluation(c) > 0) a = c;
        else b = c;
        }
        while( Math.abs((curFunction.functionEvaluation(b)*a-curFunction.functionEvaluation(a)*b)
                /(curFunction.functionEvaluation(b)-curFunction.functionEvaluation(a))-c) < eps);
        return c;
    }
}
