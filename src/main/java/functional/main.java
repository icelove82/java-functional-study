package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class main {
    public static void main(String[] args) {
        int r1 = step1.andThen(step2.andThen(step3)).apply(1);
        System.out.println(r1);

        int r2 = bi.apply(2, 5);
        System.out.println(r2);
    }

    static Function<Integer, Integer> step1 = num -> num + 1;

    static Function<Integer, Integer> step2 = num -> num * 2;

    static Function<Integer, Integer> step3 = num -> num * 10;

    static BiFunction<Integer, Integer, Integer> bi = (num1, num2) -> (num1 + num2) * 10;

}
