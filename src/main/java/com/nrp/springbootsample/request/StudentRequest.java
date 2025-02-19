package com.nrp.springbootsample.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {

    @NotBlank(message = "name is required")
    private String name;
    @Range(min = 0, max = 80)
    private int age;
    @NotBlank(message = "address is required")
    private String address;
    @Email(message = "Invalid email address")
    private String email;

}
