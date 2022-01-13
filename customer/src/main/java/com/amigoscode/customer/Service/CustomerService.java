package com.amigoscode.customer.Service;

import com.amigoscode.customer.DTO.CustomerRegistrationRequest;
import com.amigoscode.customer.Repository.CustomerRepository;
import com.amigoscode.customer.model.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService{

    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.save(customer);
    }
}
