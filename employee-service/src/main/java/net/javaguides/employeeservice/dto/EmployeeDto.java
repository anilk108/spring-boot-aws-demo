package net.javaguides.employeeservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    @NotNull(message = "User first name should not be empty")     // hibernate validation
    private String firstName;
    @NotNull(message = "User last name should not be empty")     // hibernate validation
    private String lastName;
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")          // hibernate validation
    private String email;
    private String departmentCode;
    private String organizationCode;
}
