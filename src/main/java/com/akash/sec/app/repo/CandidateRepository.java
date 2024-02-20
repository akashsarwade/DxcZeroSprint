package com.akash.sec.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akash.sec.app.model.Candidate;

@Repository
public interface CandidateRepository  extends JpaRepository<Candidate, Integer>{
	
}