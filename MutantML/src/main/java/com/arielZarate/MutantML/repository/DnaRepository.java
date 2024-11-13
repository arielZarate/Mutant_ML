package com.arielZarate.MutantML.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arielZarate.MutantML.entity.Dna;



@Repository
public interface DnaRepository extends MongoRepository<Dna,String> {

    long countByIsMutant(boolean b);


    /// no necesito ningun metodo ya trae lo necesario
}
