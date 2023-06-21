package com.example.urlcutter.service;

import com.example.urlcutter.repository.UrlJdbcRepository;

public class UrlServiceImpl implements UrlService{
    UrlJdbcRepository urlJdbcRepository;

    public UrlServiceImpl(UrlJdbcRepository urlJdbcRepository) {
        this.urlJdbcRepository = urlJdbcRepository;
    }
}
