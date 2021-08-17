package combination;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combination.CustomerValidator.ValidationResult;
import static combination.CustomerValidator.ValidationResult.*;

public interface CustomerValidator extends Function<Customer, ValidationResult> {

    static CustomerValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerValidator isPhoneValid() {
        return customer -> customer.getPhone().startsWith("+0") ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerValidator and(CustomerValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
