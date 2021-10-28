package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Candidat;

@Repository
public interface CandidatRepository extends MongoRepository<Candidat,String > {

}

