package com.klostur.eegnor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping(value="api/jobs/{id}")
	public ResponseEntity<JobApplication> findOne(@PathVariable Long id){
		JobApplication retVal = jobApplicationService.findOne(id);
		if (retVal != null) {
			return new ResponseEntity<>(retVal, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping(value="api/jobs")
	public ResponseEntity<JobApplication> create(@RequestBody JobApplication jobApplication) {
		JobApplication job = jobApplicationService.save(jobApplication);
		return new ResponseEntity<>(job, HttpStatus.CREATED);
	}
	@PutMapping(value="api/jobs/{id}")
	public ResponseEntity<JobApplication> update(@PathVariable Long id, @RequestBody JobApplication jobApplication) {
		if(jobApplicationService.findOne(id) == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			jobApplication.setId(id);
			JobApplication retVal = jobApplicationService.save(jobApplication);
			return new ResponseEntity<JobApplication>(retVal,HttpStatus.OK);
		}
	}
	
	
	@DeleteMapping(value="api/jobs/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		JobApplication retVal = jobApplicationService.findOne(id);
		if (retVal != null) {
			jobApplicationService.delete(id);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
