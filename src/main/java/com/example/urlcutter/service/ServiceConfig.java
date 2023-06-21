package com.example.urlcutter.service;

import com.example.urlcutter.repository.UrlJdbcRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    UrlServiceImpl urlService(UrlJdbcRepository urlJdbcRepository) {
        return new UrlServiceImpl(urlJdbcRepository);
    }
}
