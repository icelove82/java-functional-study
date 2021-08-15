package consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {

        Customer maria = new Customer("Maris", "999-999");

        sayHello.accept(maria);
        biSayHello.accept(maria, false);
    }

    static Consumer<Customer> sayHello = customer ->
            System.out.println("Hello :" + customer.name + ", Your phone number is :" + customer.phone);

    static BiConsumer<Customer, Boolean> biSayHello = (customer, isShow) ->
            System.out.println("Hello :" + customer.name
                    + ", Your phone number is :"
                    + (isShow ? customer.phone : "***-***"));

    static class Customer {
        private final String name;
        private final String phone;

        Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
