package combination;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Customer c1 = Customer.builder()
                .name("Alice")
                .email("alice@yahoo.com")
                .phone("+034423232")
                .dob(LocalDate.of((2000), 1, 1))
                .build();

        CustomerValidator.ValidationResult result =
                CustomerValidator
                .isEmailValid()
                .and(CustomerValidator.isPhoneValid())
                .and(CustomerValidator.isAdult())
                .apply(c1);

        System.out.println(result);

    }
}
