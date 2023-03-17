package com.medicare.bob.entity;

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
	private Long customer_id;
	private String tenant_id;
	private String agent_id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String suffix;
	private String ssn;
	private String dob;
	private String gender;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private String zip_Ext;
	private String zipcode;
	private String county;
	private String phone;
	private String cell_Phone;
	private String email;
	private String medicare;
	private String parta_eff;
	private String partb_eff;
	private String plan_name;
	private String spouse_firstname;
	private String spouse_lastname;
	private String spouse_suffix;
	private String spouse_dob;
	private String created_date;
	

	private String lastupdated_date; 
	

	public Long getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}


	public String getTenant_id() {
		return tenant_id;
	}


	public void setTenant_id(String tenant_id) {
		this.tenant_id = tenant_id;
	}


	public String getAgent_id() {
		return agent_id;
	}


	public void setAgent_id(String agent_id) {
		this.agent_id = agent_id;
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


	public String getAddress_line1() {
		return address_line1;
	}


	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}


	public String getAddress_line2() {
		return address_line2;
	}


	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip_Ext() {
		return zip_Ext;
	}


	public void setZip_Ext(String zip_Ext) {
		this.zip_Ext = zip_Ext;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getCounty() {
		return county;
	}


	public void setCounty(String county) {
		this.county = county;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCell_Phone() {
		return cell_Phone;
	}


	public void setCell_Phone(String cell_Phone) {
		this.cell_Phone = cell_Phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMedicare() {
		return medicare;
	}


	public void setMedicare(String medicare) {
		this.medicare = medicare;
	}


	public String getParta_eff() {
		return parta_eff;
	}


	public void setParta_eff(String parta_eff) {
		this.parta_eff = parta_eff;
	}


	public String getPartb_eff() {
		return partb_eff;
	}


	public void setPartb_eff(String partb_eff) {
		this.partb_eff = partb_eff;
	}


	public String getPlan_name() {
		return plan_name;
	}


	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}


	public String getSpouse_firstname() {
		return spouse_firstname;
	}


	public void setSpouse_firstname(String spouse_firstname) {
		this.spouse_firstname = spouse_firstname;
	}


	public String getSpouse_lastname() {
		return spouse_lastname;
	}


	public void setSpouse_lastname(String spouse_lastname) {
		this.spouse_lastname = spouse_lastname;
	}


	public String getSpouse_suffix() {
		return spouse_suffix;
	}


	public void setSpouse_suffix(String spouse_suffix) {
		this.spouse_suffix = spouse_suffix;
	}


	public String getSpouse_dob() {
		return spouse_dob;
	}


	public void setSpouse_dob(String spouse_dob) {
		this.spouse_dob = spouse_dob;
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
	
	
}
