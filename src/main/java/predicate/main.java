package predicate;

import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        String s1 = "01083959989";
        String s2 = "01183959989";
        String s3 = "0108395998";

        System.out.println(isValid.test(s1));
        System.out.println(isValid.test(s2));
        System.out.println(isValid.test(s3));

        System.out.println(isValid.and(isContain).test(s1));
        System.out.println(isValid.and(isContain).test(s2));
        System.out.println(isValid.and(isContain).test(s3));

        System.out.println(isValid.or(isContain).test(s1));
        System.out.println(isValid.or(isContain).test(s2));
        System.out.println(isValid.or(isContain).test(s3));

    }

    static Predicate<String> isValid = number ->
            number.startsWith("010") && number.length() == 11;

    static Predicate<String> isContain = number ->
            number.contains("9989");
}
