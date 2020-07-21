package com.enosh.auth.services;

import com.enosh.auth.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminDetailsService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return new AdminDetails();
    }
}
