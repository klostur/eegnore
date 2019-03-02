package com.klostur.eegnor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class JobApplication {
	@Id
	@GeneratedValue
	private Long id;
	
	private String companyName;
	@OneToOne
	private JobPosition jobPosition;
	@OneToOne
	private JobSeniority jobSeniority;
	
	@Column(name = "applicationDate", columnDefinition="DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date applicationDate;
	
	private boolean hasResponded;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public JobPosition getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(JobPosition jobPosition) {
		this.jobPosition = jobPosition;
	}

	public JobSeniority getJobSeniority() {
		return jobSeniority;
	}

	public void setJobSeniority(JobSeniority jobSeniority) {
		this.jobSeniority = jobSeniority;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	
	
	
}