package com.example;

public class DichotomyRootSearchMethod implements RootSearchMethod {

    @Override
    public Double findRoot(Double a, Double b, Functions curFunction,Double eps) {
        Double paramA = curFunction.functionEvaluation(a),paramC,c;
        do{
           c = (a + b) / 2.0;
           paramC = curFunction.functionEvaluation(c);
           if(curFunction.functionEvaluation(a) * paramC <= 0) b = c;
           else a = c;
        }
        while(Math.abs(b - a) > eps);

        return c;
    }
}
