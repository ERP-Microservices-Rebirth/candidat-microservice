package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Candidat;


@Service
public interface CandidatServiceImp {
	Candidat addCandidat(Candidat candidat);
	List<Candidat> retrieveAllCandidates();
	void deleteCandidat(String id);
	void deleteAllCandidates();
	Candidat updateCustomer(String id, Candidat candidat);

}
