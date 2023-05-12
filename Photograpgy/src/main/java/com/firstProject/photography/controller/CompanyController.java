package com.firstProject.photography.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstProject.photography.models.CompanyMaster;
import com.firstProject.photography.service.CompanyService;



@RestController
@RequestMapping("/company")
@CrossOrigin(origins ="*")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping
    public List<CompanyMaster> findAll() {
        return companyService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CompanyMaster> findById(@PathVariable("id") Long id) {
        return companyService.findById(id);
    }

    @PostMapping
    public CompanyMaster saveCourse(@RequestBody CompanyMaster companyMaster) {
        return companyService.saveCompany(companyMaster);
    }

    @PutMapping
    public CompanyMaster update(@RequestBody CompanyMaster companyMaster) {
        return companyService.update(companyMaster);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
    	companyService.delete(id);
    }

}
