package net.javaguides.organizationservice.repository;

import net.javaguides.organizationservice.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    public Optional<Organization> findByCode(String code);
}
