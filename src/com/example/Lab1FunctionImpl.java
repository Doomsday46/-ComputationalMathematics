package com.example;

public class Lab1FunctionImpl implements Functions {
    @Override
    public Double functionEvaluation(Double argument) {
        return 2 - Math.log10(argument) - 2 * Math.cos(argument);
    }

    @Override
    public Double firstDerivative(Double argument) {
        return 2*Math.sin(argument) - (1.0/argument);
    }

    @Override
    public Double SecondDerivative(Double argument) {
        return 2*Math.cos(argument) + (1.0/(argument*argument));
    }
}
