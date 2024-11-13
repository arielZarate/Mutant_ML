package com.arielZarate.MutantML.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "dna")
@AllArgsConstructor
@Data
@NoArgsConstructor

public class Dna {


@Id
private String id;

@Indexed(unique = true)  
private String [] dna;
private boolean isMutant;


//le agregue un boolean para que me diga si es mutente y nada mas 



}
