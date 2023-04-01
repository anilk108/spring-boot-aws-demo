package net.javaguides.employeeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        description = "Employee DTO Model Information"
)
public class EmployeeDto {
    private Long id;
    @Schema(
            description = "first name"
    )
    @NotNull(message = "User first name should not be empty")     // hibernate validation
    private String firstName;
    @NotNull(message = "User last name should not be empty")     // hibernate validation
    private String lastName;
    @Schema(
            description = "user's valid email address"
    )
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")          // hibernate validation
    private String email;
    private String departmentCode;
    private String organizationCode;
}
