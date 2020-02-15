package com.tribalscale.interview.usersservice.service;

import com.tribalscale.interview.usersservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final CompanyFeignService companyFeignService;

    public UserService(CompanyFeignService companyFeignService) {
        this.companyFeignService = companyFeignService;
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user = new User("Joan", "Dean");
        User user2 = new User("Joan", "Dean");
        users.add(user);
        users.add(user2);
        return users;
    }

    public List<Object> getCompanies() {
        return companyFeignService.getCompanies();
    }
}
