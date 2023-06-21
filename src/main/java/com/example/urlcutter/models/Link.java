package com.example.urlcutter.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Link {
    String initialUrl;
    long id;
    String shortUrl;


    public Link(String initialUrl, long id, String shortUrl) {
        this.initialUrl = initialUrl;
        this.id = id;
        this.shortUrl = shortUrl;
    }
}
