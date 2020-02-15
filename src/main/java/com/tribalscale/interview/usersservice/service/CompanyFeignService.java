package com.tribalscale.interview.usersservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "COMPANIES-SERVICE")
public interface CompanyFeignService {
    @RequestMapping(value = "/v1/api/companies")
    List<Object> getCompanies();
}
