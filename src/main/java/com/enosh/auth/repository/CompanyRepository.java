package com.enosh.auth.repository;

import com.enosh.auth.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    Optional<Company> findByEmail(String email);
}
