package com.arielZarate.MutantML.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arielZarate.MutantML.entity.Dna;
import com.arielZarate.MutantML.services.MutantService;


@RestController
@RequestMapping("/mutant")
public class MutantController {


    @Autowired
    private MutantService mutantService;

    @GetMapping("/")
    public ResponseEntity<?> Saludo() {
        return ResponseEntity.ok("Hola nuevo mutante soy Wolverine");
    }



    @PostMapping("/")
    public ResponseEntity<?> isMutant(@RequestBody Dna dna) {
       
          //llamo al service   
        boolean isMutant=mutantService.isMutant(dna);

       // Si es mutante, retornamos 200 OK, si no es mutante, retornamos 403 Forbidden
        if (isMutant) {
            return ResponseEntity.status(HttpStatus.OK).body("200-OK");
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("403-Forbidden");
        }

    }



    @GetMapping("/stats")
    public ResponseEntity<?> getStats() {
        return ResponseEntity.ok(mutantService.getStats());
        //return ResponseEntity.ok("stack");
    }
    

}
