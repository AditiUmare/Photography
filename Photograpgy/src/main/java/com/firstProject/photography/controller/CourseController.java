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

import com.firstProject.photography.models.CourseMaster;
import com.firstProject.photography.service.CourseService;

@RestController
@RequestMapping("/course")
@CrossOrigin(origins ="*")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping
    public List<CourseMaster> findAll() {
        return courseService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CourseMaster> findById(@PathVariable("id") Long id) {
        return courseService.findById(id);
    }

    @PostMapping
    public CourseMaster saveCourse(@RequestBody CourseMaster courseMaster) {
        return courseService.saveCourse(courseMaster);
    }

    @PutMapping
    public CourseMaster update(@RequestBody CourseMaster courseMaster) {
        return courseService.update(courseMaster);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
    	courseService.delete(id);
    }

}
