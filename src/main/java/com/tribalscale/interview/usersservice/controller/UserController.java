package com.tribalscale.interview.usersservice.controller;


import com.tribalscale.interview.usersservice.model.User;
import com.tribalscale.interview.usersservice.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping(path = "/users/companies", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Object> getUsersCompanies() {
        return userService.getCompanies();
    }


}
