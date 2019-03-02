package com.klostur.eegnor.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klostur.eegnor.model.JobApplication;

public interface JobApplicationRepo extends JpaRepository<JobApplication, Long> {

}
