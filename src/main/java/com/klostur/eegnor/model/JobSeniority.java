package com.klostur.eegnor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JobSeniority {
	@Id
	@GeneratedValue
	private Long id;
	
	private String seniorityName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeniorityName() {
		return seniorityName;
	}

	public void setSeniorityName(String seniorityName) {
		this.seniorityName = seniorityName;
	}
	
	

}
