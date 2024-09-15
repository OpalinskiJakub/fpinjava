package com.fpinjava.functions.exercise02_03;
import com.fpinjava.common.Result;
import com.fpinjava.functions.exercise02_03.Function;

public class FunctionExamples {

  public static final Function<Integer, Function<Integer, Integer>> add =
          new Function<Integer, Function<Integer, Integer>>() {
              @Override
              public Function<Integer, Integer> apply(Integer y) {
               return new Function<Integer, Integer> () {
                   @Override
                 public Integer apply(Integer x) {
                     return x + y;
                   }
               };
              }
          };

  public static final BinaryOperator mult2 = new BinaryOperator() {
    @Override
    public Function<Integer, Integer> apply(Integer y) {
      return new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer x) {
          return x * y;
        }
      };
    }
  };
  public static final BinaryOperator add2 =  x -> y -> x + y;

  public static final BinaryOperator mult =  x -> y -> x * y;

  public static void main(String[] args) {
    System.out.println(add.apply(5).apply(5));
    System.out.println(mult.apply(5).apply(5));
    System.out.println(add2.apply(5).apply(5));
    System.out.println(mult2.apply(5).apply(5));
  }
}
