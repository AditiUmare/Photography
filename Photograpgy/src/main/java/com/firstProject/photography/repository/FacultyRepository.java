package com.firstProject.photography.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstProject.photography.models.FacultyMaster;

public interface FacultyRepository extends JpaRepository<FacultyMaster,Long> {

}
