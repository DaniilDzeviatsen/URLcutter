package com.example.urlcutter.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class InitialUrl {
    String initialUrl;
    long initialUrlId;
}
