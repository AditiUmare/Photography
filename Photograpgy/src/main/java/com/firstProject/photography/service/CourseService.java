package com.firstProject.photography.service;

import java.util.List;
import java.util.Optional;

import com.firstProject.photography.models.CourseMaster;

public interface CourseService {

	List<CourseMaster> findAll();

	Optional<CourseMaster> findById(Long id);

	CourseMaster saveCourse(CourseMaster courseMaster);

	CourseMaster update(CourseMaster courseMaster);

	void delete(Long id);

}
