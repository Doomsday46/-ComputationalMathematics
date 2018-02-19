package com.example;

public class Main {
    public static void main(String args[]){
        Double eps = Math.pow(10,-4);
        Double a = 1.0;
        Double b = 6.0;

        Functions function = new Lab1FunctionImpl();

        RootSearchMethod searchRoot = new ChordRootSearchMethod();
        System.out.println(searchRoot.findRoot(a,b,function,eps));
    }
}
