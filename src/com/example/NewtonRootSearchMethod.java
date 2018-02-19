package com.example;

public class NewtonRootSearchMethod implements RootSearchMethod {
    @Override
    public Double findRoot(Double a, Double b, Functions curFunction, Double eps) {

        Double x = NewtonRootSearchMethod.calculationApproximation(a,b);
        Double f;
        Double df;
        if(!(a <= x && x >= b)) return b - curFunction.functionEvaluation(b)/curFunction.firstDerivative(b);
        do {
            f = curFunction.functionEvaluation(x);
            df = curFunction.firstDerivative(x);
            x = x - f / df;
        } while (Math.abs(f/df) > eps);
        return x;
    }
    private static Double calculationApproximation(Double a,Double b){
        Functions function = new Lab1FunctionImpl();

        Double f = function.functionEvaluation(a);
        Double d2f = function.SecondDerivative(a);
        if(f * d2f > 0) return a;
        else {
            f = function.functionEvaluation(b);
            d2f = function.SecondDerivative(b);
            if(f * d2f > 0) return b;
        }
        return null;
    }
}
