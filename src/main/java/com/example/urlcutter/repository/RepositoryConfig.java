package com.example.urlcutter.repository;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class RepositoryConfig {
    @Bean(destroyMethod = "close")
    HikariDataSource urlHikariDataSource(
            @Value("${urls.db.url}") String dbUrl,
            @Value("${urls.db.username}") String dbUsername,
            @Value("${urls.db.password}") String dbPassword,
            @Value("${urls.db.max-pool-size}") int dbMaxPoolSize
    ) {
        HikariConfig config = new HikariConfig();
        config.setPassword(dbPassword);
        config.setJdbcUrl(dbUrl);
        config.setUsername(dbUsername);
        config.setMaximumPoolSize(dbMaxPoolSize);
        return new HikariDataSource(config);
    }

    @Bean
    JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
