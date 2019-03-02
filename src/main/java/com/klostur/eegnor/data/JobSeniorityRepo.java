package com.klostur.eegnor.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klostur.eegnor.model.JobSeniority;

@Repository
public interface JobSeniorityRepo extends JpaRepository<JobSeniority, Long> {

}
