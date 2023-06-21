package com.example.urlcutter.repository;

import com.example.urlcutter.models.Link;

import java.util.List;

public interface UrlJdbcRepository {

    boolean ifShortenedUrlExists(String initialUrl);

    void addNewLink (String initialUrl, String shortUrl);

}
