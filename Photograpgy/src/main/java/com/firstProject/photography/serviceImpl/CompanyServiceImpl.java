package com.firstProject.photography.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstProject.photography.models.CompanyMaster;
import com.firstProject.photography.repository.CompanyRepository;
import com.firstProject.photography.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	
	@Override
	public List<CompanyMaster> findAll() {
		return companyRepository.findAll();
	}

	@Override
	public Optional<CompanyMaster> findById(Long id) {
		return companyRepository.findById(id);
	}

	@Override
	public CompanyMaster saveCompany(CompanyMaster companyMaster) {
		return companyRepository.save(companyMaster);
	}

	@Override
	public CompanyMaster update(CompanyMaster companyMaster) {
		return companyRepository.save(companyMaster);
	}

	@Override
	public void delete(Long id) {
		companyRepository.deleteById(id);
		
	}

}
