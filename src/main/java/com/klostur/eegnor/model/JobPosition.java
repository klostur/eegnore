package com.klostur.eegnor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JobPosition {
	@Id
	@GeneratedValue
	private Long id;
	
	private String positionName;
	
}
