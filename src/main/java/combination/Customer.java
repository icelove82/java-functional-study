package combination;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Customer {
    private final String name;
    private final String email;
    private final String phone;
    private final LocalDate dob;
}
