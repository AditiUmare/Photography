package com.firstProject.photography.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstProject.photography.models.CourseMaster;

public interface CourseRepository extends JpaRepository<CourseMaster , Long>{

}
