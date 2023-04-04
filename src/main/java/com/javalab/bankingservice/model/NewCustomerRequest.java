package com.javalab.bankingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewCustomerRequest {
    String lastName;
    String firstName;
    String email;
}
