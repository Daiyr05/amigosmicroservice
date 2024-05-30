package com.amigoscode.customer;

public record CustomerRegisterRequest(
        String firstName,
        String lastName,
        String email
) {
}
