package com.tribalscale.interview.companiesservice.service;

import com.tribalscale.interview.companiesservice.model.Company;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CompanyService {
    public List<Company> getCompanies() {
        return Arrays.asList(new Company("Google"),
                new Company("Microsoft"));
    }

}
