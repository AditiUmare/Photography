package com.firstProject.photography.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tbl_company")
public class CompanyMaster {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

   
    private String description;

    private String personName;

    
    private String personNumber;

   
    @Temporal(TemporalType.DATE)
    private Date startDate;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public String getPersonNumber() {
		return personNumber;
	}


	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	@Override
	public String toString() {
		return "CompanyMaster [id=" + id + ", name=" + name + ", description=" + description + ", personName="
				+ personName + ", personNumber=" + personNumber + ", startDate=" + startDate + "]";
	}
    
    
    

}
