package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.demo.entity.Candidat;
import com.example.demo.repository.CandidatRepository;

@Service
public class CandidatService implements CandidatServiceImp {
	
	@Autowired
	CandidatRepository candidatRepository;
	
	private static final Logger l = LogManager.getLogger(CandidatService.class);


	@Override
	public Candidat addCandidat(Candidat candidat) {
		// TODO Auto-generated method stub
		 return candidatRepository.save(candidat);
	}


	@Override
	public List<Candidat> retrieveAllCandidates() {
		// TODO Auto-generated method stub
		List<Candidat> candidates = candidatRepository.findAll();
		for (Candidat candidat : candidates) {
			l.info("candidat +++" + candidat);
		}
		return candidates;
	}


	@Override
	public void deleteCandidat(String id) {
		// Supprimer un candidat by id
		candidatRepository.deleteById(id);
		
	}


	@Override
	public void deleteAllCandidates() {
		//Supprimer tous les candidates
		candidatRepository.deleteAll();
		
	}


	@Override
	public Candidat updateCustomer(String id, Candidat candidat) {
		// MOdifier un candidat deja exister
		
		if (candidatRepository.findById(id).isPresent()) {
			Candidat candidatExistant = candidatRepository.findById(id).get();
			candidatExistant.setNom(candidat.getNom());
			candidatExistant.setPrenom(candidat.getPrenom());
			candidatExistant.setNombreTelephone(candidat.getNombreTelephone());
			candidatExistant.setExperience(candidat.getExperience());
			return candidatRepository.save(candidatExistant);
		} else return null;
	}
}
	


