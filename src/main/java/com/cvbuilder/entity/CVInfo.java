package com.cvbuilder.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CVInfo {
	
	@Id
	private String email;
	private String name;
	private String middleName;
	private String surName;
	private String primaryContactNumber;
	private String secondaryContactNumber;
	private String address;
	private String jobRolesOrTitles;
	private String keySkills;
	private String strengths;
	private String careerAccomplishments;
	private String professionalExperience;
	private String education;
	private String certification;
	private String webSiteURL;
	private String linkedInURL;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getPrimaryContactNumber() {
		return primaryContactNumber;
	}
	public void setPrimaryContactNumber(String primaryContactNumber) {
		this.primaryContactNumber = primaryContactNumber;
	}
	public String getSecondaryContactNumber() {
		return secondaryContactNumber;
	}
	public void setSecondaryContactNumber(String secondaryContactNumber) {
		this.secondaryContactNumber = secondaryContactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJobRolesOrTitles() {
		return jobRolesOrTitles;
	}
	public void setJobRolesOrTitles(String jobRolesOrTitles) {
		this.jobRolesOrTitles = jobRolesOrTitles;
	}
	public String getKeySkills() {
		return keySkills;
	}
	public void setKeySkills(String keySkills) {
		this.keySkills = keySkills;
	}
	public String getStrengths() {
		return strengths;
	}
	public void setStrengths(String strengths) {
		this.strengths = strengths;
	}
	public String getCareerAccomplishments() {
		return careerAccomplishments;
	}
	public void setCareerAccomplishments(String careerAccomplishments) {
		this.careerAccomplishments = careerAccomplishments;
	}
	public String getProfessionalExperience() {
		return professionalExperience;
	}
	public void setProfessionalExperience(String professionalExperience) {
		this.professionalExperience = professionalExperience;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public String getWebSiteURL() {
		return webSiteURL;
	}
	public void setWebSiteURL(String webSiteURL) {
		this.webSiteURL = webSiteURL;
	}
	public String getLinkedInURL() {
		return linkedInURL;
	}
	public void setLinkedInURL(String linkedInURL) {
		this.linkedInURL = linkedInURL;
	}

}
