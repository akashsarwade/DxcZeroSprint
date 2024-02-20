package com.akash.sec.app.test;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.akash.sec.app.controller.CandidateController;
import com.akash.sec.app.model.Candidate;
import com.akash.sec.app.repo.CandidateRepository;
import com.akash.sec.app.service.CandidateService;

@SpringBootTest
class SprintZeroApplicationTestsTests {

	@Mock
	CandidateRepository candidateRepository;

	@Autowired
	CandidateService candidateService;

	@Autowired
	CandidateController candidateController;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void testGetAllCandidates() throws Exception {
//		// Mocking the behavior of CandidateRepository
//		List<Candidate> candidates = Arrays.asList(new Candidate(101, 343, "John Doe", 80, 1, new java.util.Date()),
//				new Candidate(322, 102, "Jane Smith", 85, 2, new java.util.Date()));
//		when(candidateRepository.findAll()).thenReturn(candidates);
//
//	}

}

// Testing the controller endpoint
//MockMvc.perform(MockMvcRequestBuilders.get("/getAll")).andExpect(MockMvcResultMatchers.status().isOk())
//		.andExpect(MockMvcResultMatchers.jsonPath("$[0].candidateNo").value(101))
//		.andExpect(MockMvcResultMatchers.jsonPath("$[1].candidateName").value("Jane Smith"));
