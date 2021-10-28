package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.example.demo.entity.Candidat;
import com.example.demo.service.CandidatServiceImp;

@RestController
@RequestMapping(value = "/api/candidates")
public class CandidatRestController {
	@Autowired
	CandidatServiceImp candidatServiceImp;
	
	// Ajouter Candidat : http://localhost:8081/api/candidates
	@PostMapping	
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Candidat> addCandidat(@RequestBody Candidat candidat) {
		return new ResponseEntity<>(candidatServiceImp.addCandidat(candidat), HttpStatus.OK);
	}	
	// Supprimer tous les Clients : http://localhost:8081/api/candidates
			@DeleteMapping
			@ResponseBody
			public void deleteAllCandidates() {
				candidatServiceImp.deleteAllCandidates();
			}
			// Supprimer candidat : http://localhost:8081/api/candidates/{id}
			@DeleteMapping("/{id}")
			@ResponseBody
			public void deleteCandidat(@PathVariable("id") String id) {
				candidatServiceImp.deleteCandidat(id);
			}
			

}
