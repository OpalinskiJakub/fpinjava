package com.fpinjava.functions.exercise02_03.Solutions;

public class FunctionExamples {

    static BianryOperator addTwo = new BianryOperator() {
        @Override
        public Function<Integer, Integer> apply(Integer x) {
            return new Function<Integer, Integer>() {
                @Override
                public Integer apply(Integer y) {
                    return x+y;
                }
            };
        }
    };

    public static void main(String[] args) {
        System.out.println(addTwo.apply(1).apply(2));
    }
}
