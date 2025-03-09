package loan.challenge.loan_challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequestDTO {
    
    private int age;
    private String cpf;
    private double income;
    private String location;
    private String name;
}
