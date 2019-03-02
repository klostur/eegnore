package com.klostur.eegnor.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klostur.eegnor.model.JobPosition;

@Repository
public interface JobPositionRepo extends JpaRepository<JobPosition, Long> {

}
