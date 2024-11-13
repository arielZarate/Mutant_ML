package com.arielZarate.MutantML.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arielZarate.MutantML.entity.Dna;
import com.arielZarate.MutantML.entity.Stats;
import com.arielZarate.MutantML.repository.DnaRepository;
import com.mongodb.DuplicateKeyException;

@Service
public class MutantService {

    @Autowired
    private DnaRepository dnaRepository;

    @Autowired
    private MutantDetector mutantDetector;

    public boolean isMutant(Dna dna) {
        try {
            boolean isMutant = mutantDetector.isMutant(dna.getDna());

            /**
             * //si es true guardo los datos
             * if (isMutant) {
             * dna.setDna(dna.getDna());
             * dna.setMutant(isMutant);
             * 
             * dnaRepository.save(dna);
             * }
             */

            dna.setDna(dna.getDna());
            dna.setMutant(isMutant);

            dnaRepository.save(dna);

            return isMutant;
        } catch (DuplicateKeyException e) {

            throw new Error("Dna duplicado");
        }

    }

    /*
     * ratio= cont_mutant_dna/(cont_mutant_dna+count_human_dna)
     * 
     * ​
     * 
     * 
     * 
     */

    // cree una clase stats
    public Stats getStats() {
        long countMutantDna = dnaRepository.countByIsMutant(true);
        long countHumanDna = dnaRepository.countByIsMutant(false);
        double ratio = (double) countMutantDna / (countHumanDna + countMutantDna);

        return new Stats(countMutantDna, countHumanDna, ratio);
    }

}
