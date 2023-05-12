package com.firstProject.photography.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstProject.photography.models.CompanyMaster;


public interface CompanyRepository extends JpaRepository<CompanyMaster , Long>{

}
