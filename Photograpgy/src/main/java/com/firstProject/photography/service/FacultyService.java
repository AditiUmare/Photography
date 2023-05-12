package com.firstProject.photography.service;

import java.util.List;
import java.util.Optional;

import com.firstProject.photography.models.FacultyMaster;

public interface FacultyService {

	List<FacultyMaster> findAll();

	Optional<FacultyMaster> findById(Long id);

	FacultyMaster saveFaculty(FacultyMaster facultyMaster);

	FacultyMaster update(FacultyMaster facultyMaster);

	void delete(Long id);

}
