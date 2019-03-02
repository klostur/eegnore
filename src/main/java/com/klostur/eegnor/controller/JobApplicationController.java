package com.klostur.eegnor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klostur.eegnor.model.JobApplication;
import com.klostur.eegnor.service.JobApplicationService;

@RestController
public class JobApplicationController {
	@Autowired
	private JobApplicationService jobApplicationService;
	
	@GetMapping(value="api/jobs")
	public ResponseEntity<List<JobApplication>> findAll(){
		List<JobApplication> jobs = jobApplicationService.findAll();
		return new ResponseEntity<List<JobApplication>>(jobs, HttpStatus.OK);
	}
}
