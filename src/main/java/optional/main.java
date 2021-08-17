package optional;

import java.util.Optional;

public class main {
    public static void main(String[] args) {
        String email = "ymh@google.com";
        Optional.of(email)
                .ifPresent(System.out::println);

    }
}
