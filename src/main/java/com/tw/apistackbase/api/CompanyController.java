package com.tw.apistackbase.api;

import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {



    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping(produces = {"application/json"})
    public List<Company> list() {
        List<Company> companies = companyRepository.findAll();
        System.out.println(companies.get(0));
        System.out.println(companies.get(0).getEmployees().get(0));
        System.out.println(companies.get(0).getEmployees().get(0).getCompany());
        System.out.println(companies.get(0).getEmployees().get(0).getCompany().getEmployees().get(0));
        return companyRepository.findAll();
    }
    
    @PostMapping(produces = {"application/json"})
    public Company add(@RequestBody Company company) {
        return companyRepository.saveAndFlush(company);
    }
}
