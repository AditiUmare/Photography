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
@Table(name = "tbl_course")
public class CourseMaster {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;

    private String name;
    
    private String description;

    @Temporal(TemporalType.DATE)
    private Date startDate;

   
    @Temporal(TemporalType.DATE)
    private Date endDate;

    private Long addedBy;

    @Temporal(TemporalType.DATE)
    private Date addedDate;

    private Long modifyBy;

    @Temporal(TemporalType.DATE)
    private Date modifyDate;

    private String status;

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(Long addedBy) {
		this.addedBy = addedBy;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Long getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(Long modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CourseMaster [courseId=" + courseId + ", name=" + name + ", description=" + description + ", startDate="
				+ startDate + ", endDate=" + endDate + ", addedBy=" + addedBy + ", addedDate=" + addedDate
				+ ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate + ", status=" + status + "]";
	}

	public CourseMaster(Long courseId, String name, String description, Date startDate, Date endDate, Long addedBy,
			Date addedDate, Long modifyBy, Date modifyDate, String status) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.addedBy = addedBy;
		this.addedDate = addedDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.status = status;
	}

	public CourseMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    

}
