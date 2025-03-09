package loan.challenge.loan_challenge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import loan.challenge.loan_challenge.dto.CustomerRequestDTO;
import loan.challenge.loan_challenge.dto.LoansResponseDTO;

@Service
public class LoanService {

    public List<LoansResponseDTO> determineLoans(CustomerRequestDTO customerRequestDTO) {
        int age = customerRequestDTO.getAge();
        double income = customerRequestDTO.getIncome();
        String location = customerRequestDTO.getLocation();

        List<LoansResponseDTO> loans = new ArrayList<>();

        if (income <= 3000) {
            loans.add(new LoansResponseDTO("PERSONAL", 4));
            loans.add(new LoansResponseDTO("GUARANTEED", 3));
        }
        if (income <= 5000) {
            loans.add(new LoansResponseDTO("CONSIGNMENT", 2));
        }
        if (income > 3000 && income <= 5000 && age < 30 && "SP".equalsIgnoreCase(location)) {
            loans.add(new LoansResponseDTO("PERSONAL", 4));
            loans.add(new LoansResponseDTO("GUARANTEED", 3));
        }
        return loans;
    }
}
