package callback;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {
        hello("ymh", null, value -> {
            System.out.println("No last name provided for " + value);
        });

        BiHello("John", null, (firstName, defaultName) -> {
            System.out.println("The full name is : " + firstName + " "+ defaultName);
        });

        helloRun("John", null, ()-> System.out.println("You only have first name."));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void BiHello(String firstName, String lastName, BiConsumer<String, String> callback) {
        if (lastName != null) {
            System.out.println("Full name is : " + firstName + lastName);
        } else {
            callback.accept(firstName, "OK");
        }
    }

    static void helloRun(String firstName, String lastName, Runnable callback) {
        if (lastName != null) {
            System.out.println("Full name is : " + firstName + lastName);
        } else {
            callback.run();
        }
    }

}
