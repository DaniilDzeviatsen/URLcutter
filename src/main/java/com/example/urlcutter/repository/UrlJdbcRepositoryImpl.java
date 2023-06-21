package com.example.urlcutter.repository;

import com.example.urlcutter.models.Link;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UrlJdbcRepositoryImpl implements UrlJdbcRepository {
    private final JdbcOperations jdbcOperations;

    public UrlJdbcRepositoryImpl(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }


    @Override
    public boolean ifShortenedUrlExists(String initialUrl) {
        /*return jdbcOperations.query("""
                select true
                from link
                where full_url = ?;
                """,
        );*/
        return false;
    }

    @Override
    public void addNewLink(String initialUrl, String shortUrl) {
        jdbcOperations.update("""
                insert into link (full_url, short_url)
                values (? ?)
                """, initialUrl, shortUrl
        );
    }

    private Link mapToLink(ResultSet resultSet) throws SQLException {
        return new Link(
                resultSet.getString("initialUrl"),
                resultSet.getLong("id"),
                resultSet.getString("shortUrl")
        );
    }
}
