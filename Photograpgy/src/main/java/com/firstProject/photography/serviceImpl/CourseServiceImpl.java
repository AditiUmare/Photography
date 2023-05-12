package com.firstProject.photography.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstProject.photography.models.CourseMaster;
import com.firstProject.photography.repository.CourseRepository;
import com.firstProject.photography.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	
	
	@Override
	public List<CourseMaster> findAll() {
		return courseRepository.findAll();
	}

	@Override
	public Optional<CourseMaster> findById(Long id) {
		return courseRepository.findById(id);
	}

	@Override
	public CourseMaster saveCourse(CourseMaster courseMaster) {
		return courseRepository.save(courseMaster);
	}

	@Override
	public CourseMaster update(CourseMaster courseMaster) {
		return courseRepository.save(courseMaster);
	}

	@Override
	public void delete(Long id) {
		courseRepository.deleteById(id);
		
	}

}
