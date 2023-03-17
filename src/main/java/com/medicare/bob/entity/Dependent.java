package com.medicare.bob.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dependent_details")

public class Dependent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(nullable=false)
	private Long dependent_id;
	
	@Column(insertable=false, updatable=false)
	private String customer_id;
	
	private String first_name;
	private String middle_name;
	private String last_name;
	private String suffix;
	private String ssn;
	private String dob;
	private String gender;
	private String created_date;
	private String lastupdated_date;
	
	
	public Long getDependent_id() {
		return dependent_id;
	}
	public void setDependent_id(Long dependent_id) {
		this.dependent_id = dependent_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getLastupdated_date() {
		return lastupdated_date;
	}
	public void setLastupdated_date(String lastupdated_date) {
		this.lastupdated_date = lastupdated_date;
	}
	
	
 
    
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "customer_id", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
//    private Customer customer;
	

}
