package supplier;

import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {
        System.out.println(getUrl.get());
    }

    static Supplier<String> getUrl = () -> "https://yahoo.com";
}
