package com.fpinjava.functions.exercise02_01.Solution;

public class FunctionExamples {

    static Function<Integer, Integer> triple = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer arg) {
            return arg * 3;
        }
    };

    static Function<Integer, Integer> square = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer arg) {
            return arg * arg;
        }
    };

    public static Function<Integer, Integer> compose(Function<Integer,Integer> f1, Function<Integer,Integer> f2) {
        return new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return f1.apply(f2.apply(arg));
            }
        };
    }

    public static void main(String[] args) {
        Function<Integer, Integer> function = compose(triple, square);
        System.out.println(function.apply(5));
    }
}
