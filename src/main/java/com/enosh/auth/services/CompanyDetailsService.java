package com.enosh.auth.services;

import com.enosh.auth.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CompanyDetailsService implements UserDetailsService {

    private final CompanyRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return repository.findByEmail(email).map(CompanyDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException(
                        "Company by the emsail " + email + " does not exists"
                ));
    }
}
