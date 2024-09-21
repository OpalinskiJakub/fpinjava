package com.fpinjava.functions.exercise02_04;

public class FunctionExamples {

  public static final Function<Integer, Integer> triple = x -> x * 3;

  public static final Function<Integer, Integer> square = x -> x * x;

  public static final Function<Function<Integer, Integer>, Function<Function<Integer, Integer>,
                                        Function<Integer, Integer>>> compose =
          new Function<Function<Integer, Integer>, Function<Function<Integer, Integer>, Function<Integer, Integer>>>(){
            @Override
            public Function<Function<Integer, Integer>, Function<Integer, Integer>> apply(Function<Integer, Integer> f1) {
              return new Function<Function<Integer, Integer>, Function<Integer, Integer>>() {
                @Override
                public Function<Integer, Integer> apply(Function<Integer, Integer> f2) {
                  return new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer arg) {
                      return f1.apply(f2.apply(arg));
                    }
                  };
                }
              };
            }
          };

  public static final Function<Function<Integer, Integer>, Function<Function<Integer, Integer>,
          Function<Integer, Integer>>> compose2 =
          f1 -> f2 -> x -> f1.apply(f2.apply(x));


  public static final Function<Integer, Integer> f = compose2.apply(square).apply(triple);

  public static final Function<Integer, Integer> f1 = compose.apply(square).apply(triple);

  public static void main(String[] args) {
    System.out.println(f.apply(1));
    System.out.println(f.apply(1));

  }
}
