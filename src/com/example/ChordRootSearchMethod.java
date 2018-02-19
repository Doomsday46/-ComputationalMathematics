package com.example;

public class ChordRootSearchMethod implements RootSearchMethod {
//    @Override
//    public Double findRoot(Double a, Double b, Functions curFunction, Double eps) {
//        Double t = 0.0;
//        while (Math.abs(b - a) > eps) {
//            t = a +  (curFunction.functionEvaluation(b) * (b - a)) / (curFunction.functionEvaluation(b) - curFunction.functionEvaluation(a));
//            if (curFunction.functionEvaluation(a) * curFunction.functionEvaluation(t) < 0) {
//                b = t;
//                System.out.println(b);
//            } else if (curFunction.functionEvaluation(t) * curFunction.functionEvaluation(b) < 0) {
//                a = t;
//               System.out.println(a);
//            } else
//                return t;
//        }
//        return t;
//    }
//
//    private Double calculationXZero(Double arg,Double a, Double b,Functions curFunction){
//        return arg-((b-a)/(curFunction.functionEvaluation(b)-curFunction.functionEvaluation(a)))*curFunction.functionEvaluation(arg);
//    }
    @Override
    public Double findRoot(Double a, Double b, Functions curFunction, Double eps) {
    Double xZero = 0.0;
    Double x1 = 0.0;
    Double check = 0.0;

    if(curFunction.functionEvaluation(a)*curFunction.SecondDerivative(a) > 0) xZero = calculationXZero(b,a,b,curFunction);
    else xZero = calculationXZero(a,a,b,curFunction);

    do{
        if(curFunction.functionEvaluation(a)*curFunction.SecondDerivative(a) > 0) x1 = calculationX1A(xZero,a,curFunction);
        else x1 = calculationX1B(xZero,b,curFunction);
        check = xZero - x1;
        xZero = x1;
    }while (Math.abs(check) > eps);
    return x1;
}

    private Double calculationXZero(Double arg,Double a, Double b,Functions curFunction){
        return arg-((b-a)/(curFunction.functionEvaluation(b)-curFunction.functionEvaluation(a)))*curFunction.functionEvaluation(arg);
    }
    private Double calculationX1A(Double arg,Double a,Functions curFunction){
        return arg-((arg-a)/(curFunction.functionEvaluation(arg)-curFunction.functionEvaluation(a)))*curFunction.functionEvaluation(arg);
    }
    private Double calculationX1B(Double arg,Double b,Functions curFunction){
        return arg-((b-arg)/(curFunction.functionEvaluation(b)-curFunction.functionEvaluation(arg)))*curFunction.functionEvaluation(arg);
    }
}
