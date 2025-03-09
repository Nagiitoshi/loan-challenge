package loan.challenge.loan_challenge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import loan.challenge.loan_challenge.dto.CustomerRequestDTO;
import loan.challenge.loan_challenge.dto.LoansResponseDTO;
import loan.challenge.loan_challenge.service.LoanService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public Map<String, Object> getAvailableLoans(@RequestBody CustomerRequestDTO customerRequestDTO) {

        List<LoansResponseDTO> loans = loanService.determineLoans(customerRequestDTO);

        Map<String, Object> response = new HashMap<>();

        response.put("customer", customerRequestDTO.getName());
        response.put("loans", loans);

        return response;
    }
}
