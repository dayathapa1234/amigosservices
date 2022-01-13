package com.amigoscode.customer.DTO;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
