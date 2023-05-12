package com.firstProject.photography.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tbl_faculty")
public class FacultyMaster {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long fId;

	    private String name;

	    
	    private String middleName;

	   
	    private String lastName;

	    
	    private String address;

	    
	    private String mobileNumber;

	    
	    private String alternateMobileNumber;

	    
	    private String alternateContactName;

	    
	    private String gender;

	    private String email;

	    @Temporal(TemporalType.DATE)
	    private Date dob;

	    
	    private String status;


		public Long getfId() {
			return fId;
		}


		public void setfId(Long fId) {
			this.fId = fId;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getMiddleName() {
			return middleName;
		}


		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getMobileNumber() {
			return mobileNumber;
		}


		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}


		public String getAlternateMobileNumber() {
			return alternateMobileNumber;
		}


		public void setAlternateMobileNumber(String alternateMobileNumber) {
			this.alternateMobileNumber = alternateMobileNumber;
		}


		public String getAlternateContactName() {
			return alternateContactName;
		}


		public void setAlternateContactName(String alternateContactName) {
			this.alternateContactName = alternateContactName;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public Date getDob() {
			return dob;
		}


		public void setDob(Date dob) {
			this.dob = dob;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		@Override
		public String toString() {
			return "FacultyMaster [fId=" + fId + ", name=" + name + ", middleName=" + middleName + ", lastName="
					+ lastName + ", address=" + address + ", mobileNumber=" + mobileNumber + ", alternateMobileNumber="
					+ alternateMobileNumber + ", alternateContactName=" + alternateContactName + ", gender=" + gender
					+ ", email=" + email + ", dob=" + dob + ", status=" + status + "]";
		}




}
