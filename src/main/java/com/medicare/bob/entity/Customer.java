package com.medicare.bob.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_details")

public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CustomerID;
	
	private String TenantID;
	private String AgentID;
	private String First_Name;
	private String Middle_Name;
	private String Last_Name;
	private String Suffix;
	private String SSN;
	private String DOB;
	private String Gender;
	
	private String Address_Line1;
	private String Address_Line2;
	
	private String City;
	private String State;
	private String Zip_Ext;
	private String Zipcode;
	private String County;
	private String Phone;
	private String Cell_Phone;
	private String Email;
	private String Medicare;
	private String PartA_Eff;
	private String PartB_Eff;
	private String Plan_Name;
	private String Spouse_Firstname;
	private String Spouse_Lastname;
	private String Spouse_Suffix;
	private String Spouse_DOB;
	private String Created_Date;
	
//	@Column(name="LastUpdated_Date")
//	private String LastUpdated_Date; 
	
	public Long getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(Long customerID) {
		CustomerID = customerID;
	}
	public String getTenantID() {
		return TenantID;
	}
	public void setTenantID(String tenantID) {
		TenantID = tenantID;
	}
	public String getAgentID() {
		return AgentID;
	}
	public void setAgentID(String agentID) {
		AgentID = agentID;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getMiddle_Name() {
		return Middle_Name;
	}
	public void setMiddle_Name(String middle_Name) {
		Middle_Name = middle_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getSuffix() {
		return Suffix;
	}
	public void setSuffix(String suffix) {
		Suffix = suffix;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress_Line1() {
		return Address_Line1;
	}
	public void setAddress_Line1(String address_Line1) {
		Address_Line1 = address_Line1; 
	}
	public String getAddress_Line2() {
		return Address_Line2;
	}
	public void setAddress_Line2(String address_Line2) {
		Address_Line2 = address_Line2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip_Ext() {
		return Zip_Ext;
	}
	public void setZip_Ext(String zip_Ext) {
		Zip_Ext = zip_Ext;
	}
	public String getZipcode() {
		return Zipcode;
	}
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
	public String getCounty() {
		return County;
	}
	public void setCounty(String county) {
		County = county;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getCell_Phone() {
		return Cell_Phone;
	}
	public void setCell_Phone(String cell_Phone) {
		Cell_Phone = cell_Phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMedicare() {
		return Medicare;
	}
	public void setMedicare(String medicare) {
		Medicare = medicare;
	}
	public String getPartA_Eff() {
		return PartA_Eff;
	}
	public void setPartA_Eff(String partA_Eff) {
		PartA_Eff = partA_Eff;
	}
	public String getPartB_Eff() {
		return PartB_Eff;
	}
	public void setPartB_Eff(String partB_Eff) {
		PartB_Eff = partB_Eff;
	}
	public String getPlan_Name() {
		return Plan_Name;
	}
	public void setPlan_Name(String plan_Name) {
		Plan_Name = plan_Name;
	}
	public String getSpouse_Firstname() {
		return Spouse_Firstname;
	}
	public void setSpouse_Firstname(String spouse_Firstname) {
		Spouse_Firstname = spouse_Firstname;
	}
	public String getSpouse_Lastname() {
		return Spouse_Lastname;
	}
	public void setSpouse_Lastname(String spouse_Lastname) {
		Spouse_Lastname = spouse_Lastname;
	}
	public String getSpouse_Suffix() {
		return Spouse_Suffix;
	}
	public void setSpouse_Suffix(String spouse_Suffix) {
		Spouse_Suffix = spouse_Suffix;
	}
	public String getSpouse_DOB() {
		return Spouse_DOB;
	}
	public void setSpouse_DOB(String spouse_DOB) {
		Spouse_DOB = spouse_DOB;
	}
	public String getCreated_Date() {
		return Created_Date;
	}
	public void setCreated_Date(String created_Date) {
		Created_Date = created_Date;
	}
//	public String getLastUpdated_Date() {
//		return LastUpdated_Date;
//	}
//	public void setLastUpdated_Date(String lastUpdated_Date) {
//		LastUpdated_Date = lastUpdated_Date;
//	}
//	

	
}
