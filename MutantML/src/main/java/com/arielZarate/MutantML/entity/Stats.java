package com.arielZarate.MutantML.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stats {
    private long contMutantDna;
    private long countHumanDna;
    private double ratio;
}
