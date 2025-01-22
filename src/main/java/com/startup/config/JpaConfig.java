package com.startup.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

@Configuration
@EnableJpaAuditing
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return () -> Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication())
                .flatMap(authentication -> {
                    if (authentication.getPrincipal() instanceof UserDetails) {
                        return Optional.of(((UserDetails) authentication.getPrincipal()).getUsername());
                    } else {
                        return Optional.ofNullable(authentication.getPrincipal().toString());
                    }
                })
                .or(() -> Optional.of("system")); // Default to "system" if no user is authenticated
    }
}
