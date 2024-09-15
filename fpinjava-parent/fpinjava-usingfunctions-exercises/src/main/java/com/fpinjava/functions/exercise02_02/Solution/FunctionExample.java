package com.fpinjava.functions.exercise02_02.Solution;

public class FunctionExample {

    private static Function<Integer, Integer> triple = x -> x * 3;

    private static Function<Integer, Integer> square = x -> x * x;

    private static Function<Integer, Integer> compose(Function<Integer, Integer> f1, Function<Integer, Integer> f2) {

        return arg -> f1.apply(f2.apply(arg));

    }

    public static void main(String[] args) {
        Function<Integer, Integer> composed = compose(triple, square);

        System.out.println(composed.apply(5));
    }
}
