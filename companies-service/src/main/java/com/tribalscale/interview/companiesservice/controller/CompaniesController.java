package com.tribalscale.interview.companiesservice.controller;

import com.tribalscale.interview.companiesservice.model.Company;
import com.tribalscale.interview.companiesservice.service.CompanyService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class CompaniesController {

    private final CompanyService companyService;

    public CompaniesController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping(path = "/companies" , produces =  MediaType.APPLICATION_JSON_VALUE )
    public List<Company> getCompanies(){
        return companyService.getCompanies();
    }
}
