package com.akash.sec.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.sec.app.model.Candidate;
import com.akash.sec.app.repo.CandidateRepository;

@Service
public class CandidateService {

	private static final Logger logger = LoggerFactory.getLogger(CandidateService.class);

	@Autowired
	private CandidateRepository candidateRepository;

	public List<Candidate> getAllCandidates() {
		logger.info("This is Service class getAllCandidate method Called.");
		return candidateRepository.findAll();
	}

}
