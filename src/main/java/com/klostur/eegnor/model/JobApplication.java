package com.klostur.eegnor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
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
	@Temporal(TemporalType.DATE)
	private Date applicationDate;
	
	private boolean hasResponded;
	
	@Column(name = "responseDate", columnDefinition="DATE")
	@Temporal(TemporalType.DATE)
	private Date responseDate;
	
	private boolean calledForInterview;
	
	@Column(columnDefinition="TEXT")
	private String comment;
	
	@Column(columnDefinition="TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@PrePersist
    protected void onCreate() {
    createdAt = new Date();
    }
	
	
	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}

	public boolean isCalledForInterview() {
		return calledForInterview;
	}

	public void setCalledForInterview(boolean calledForInterview) {
		this.calledForInterview = calledForInterview;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isHasResponded() {
		return hasResponded;
	}

	public void setHasResponded(boolean hasResponded) {
		this.hasResponded = hasResponded;
	}

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
