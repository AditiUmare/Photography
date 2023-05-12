package com.firstProject.photography.service;

import java.util.List;
import java.util.Optional;

import com.firstProject.photography.models.CompanyMaster;
import com.firstProject.photography.models.CourseMaster;

public interface CompanyService {

	List<CompanyMaster> findAll();

	Optional<CompanyMaster> findById(Long id);

	CompanyMaster saveCompany(CompanyMaster companyMaster);

	CompanyMaster update(CompanyMaster companyMaster);

	void delete(Long id);


}
