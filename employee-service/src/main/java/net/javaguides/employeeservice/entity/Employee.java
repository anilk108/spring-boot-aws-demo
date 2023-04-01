package net.javaguides.employeeservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull     // hibernate validation
    private String firstName;
    @NotNull     // hibernate validation
    private String lastName;
    @Column(nullable = false, unique = true)
    @Email          // hibernate validation
    private String email;
    private String departmentCode;
    private String organizationCode;
}
