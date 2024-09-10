package com.fpinjava.functions.exercise02_00.Solution;
import com.fpinjava.functions.exercise02_00.Function;
public class Main {

    static Function triple = new Function() {
        @Override
        public int apply(int input) {
            return input * 2;
        }
    };

    static Function square = new Function() {
        @Override
        public int apply(int input) {
            return input * input;
        }
    };

    public static Function compose(Function f1, Function f2) {
        return new Function() {
            @Override
            public int apply(int input) {
                return f1.apply(f2.apply(input));
            }
        };
    }

    public static void main(String[] args) {
        Function composedFunction = compose(triple,square);

        System.out.println(composedFunction.apply(5));
    }
}
