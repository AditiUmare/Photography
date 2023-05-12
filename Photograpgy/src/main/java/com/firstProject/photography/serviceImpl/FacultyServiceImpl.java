package com.firstProject.photography.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstProject.photography.models.FacultyMaster;
import com.firstProject.photography.repository.FacultyRepository;
import com.firstProject.photography.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService {

	@Autowired
	private FacultyRepository facultyRepository;
	
	
	@Override
	public List<FacultyMaster> findAll() {
		return facultyRepository.findAll();
	}

	@Override
	public Optional<FacultyMaster> findById(Long id) {
		return facultyRepository.findById(id);
	}

	@Override
	public FacultyMaster saveFaculty(FacultyMaster facultyMaster) {
		return facultyRepository.save(facultyMaster);
	}

	@Override
	public FacultyMaster update(FacultyMaster facultyMaster) {
		return facultyRepository.save(facultyMaster);
	}

	@Override
	public void delete(Long id) {
		facultyRepository.deleteById(id);
		
	}

}
