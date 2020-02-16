package com.tribalscale.interview.usersservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerITest {

    private static final String CLIENT_NAME = "client";
    private static final String CLIENT_PASSWORD = "secret";
    private HttpEntity<Object> header;
    private String accessToken = "f26b3a1b-ac1f-4976-a600-4243f5e2f38a";

    @Autowired
    private TestRestTemplate restTemplate;

    @BeforeEach
    public void testOAuthAccessTokenIsReturned() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.AUTHORIZATION, "Bearer "+ accessToken);
        header = new HttpEntity<Object>(null, headers);


    }

    @Test
    public void canGetUserNames() throws JsonProcessingException {
        //{"error":"unauthorized","error_description":"Full authentication is required to access this resource"}
        ResponseEntity<String> result = this.restTemplate.postForEntity("/v1/api/users", header, String.class);
        assertNotNull(result);
    }

    @Test
    public void canGetCompanyNames() {
        ResponseEntity<String> result = this.restTemplate.postForEntity("/v1/api/users/companies", header, String.class);
        assertNotNull(result);
    }
}
