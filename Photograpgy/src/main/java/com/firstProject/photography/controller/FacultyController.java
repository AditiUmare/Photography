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
import com.firstProject.photography.models.FacultyMaster;
import com.firstProject.photography.service.FacultyService;

@RestController
@RequestMapping("/faculty")
@CrossOrigin(origins ="*")
public class FacultyController {
	
	@Autowired
	private FacultyService facultyService;
	
	@GetMapping
    public List<FacultyMaster> findAll() {
        return facultyService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FacultyMaster> findById(@PathVariable("id") Long id) {
        return facultyService.findById(id);
    }

    @PostMapping
    public FacultyMaster saveFaculty(@RequestBody FacultyMaster facultyMaster) {
        return facultyService.saveFaculty(facultyMaster);
    }

    @PutMapping
    public FacultyMaster update(@RequestBody FacultyMaster facultyMaster) {
        return facultyService.update(facultyMaster);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
    	facultyService.delete(id);
    }

}
