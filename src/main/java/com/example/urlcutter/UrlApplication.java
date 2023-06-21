package com.example.urlcutter;

import com.example.urlcutter.repository.RepositoryConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UrlApplication {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(RepositoryConfig.class)){

        }

    }
}
