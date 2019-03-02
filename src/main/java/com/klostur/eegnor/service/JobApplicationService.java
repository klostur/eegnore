package com.klostur.eegnor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klostur.eegnor.data.JobApplicationRepo;
import com.klostur.eegnor.model.JobApplication;

@Service
public class JobApplicationService {
	
	@Autowired
	private JobApplicationRepo jobApplicationRepo;

	public List<JobApplication> findAll() {
		return jobApplicationRepo.findAll();
	}
	
}
