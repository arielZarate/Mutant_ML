package com.arielZarate.MutantML.services;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.arielZarate.MutantML.entity.Dna;
import com.arielZarate.MutantML.repository.DnaRepository;


public class MutantServiceTest {

    @Mock
    private DnaRepository dnaRepository; // simulamos la dependencia al bd

    @Mock
    private MutantDetector mutantDetector; // Mock para el detector de mutantes

    @InjectMocks
    private MutantService mutantService;

    private Dna dna;

    // antes de inciiar cargo el setup
    @BeforeEach
    void setup() {
        dna = new Dna();
        dna.setDna(new String[] { "ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG" }); // inciamos con estos
                                                                                                 // datos
        dna.setMutant(false); // Al principio asumimos que es un humano
    }


    
/**    @Test
    void testIsMutant() throws Exception {

         MutantDetector mutantDetector = mock(MutantDetector.class); //ya declarado el
        // mock
       
        when(mutantDetector.isMutant(dna.getDna())).thenReturn(false); // espero que sea falso

        boolean result = mutantService.isMutant(dna);

        assertFalse(result, "El DNA deberia ser humano");
        verify(dnaRepository, times(1)).save(dna);

    } 
 */
 

 /**   @Test
    void testIsMutantWithMutant() {
        // Configuramos el comportamiento del detector de mutantes mockeado
        when(mutantDetector.isMutant(dna.getDna())).thenReturn(true);  // Es un mutante

        // Ejecutamos el método
        boolean result = mutantService.isMutant(dna);

        // Verificamos que el resultado sea true (mutante)
        assertTrue(result, "El DNA debería ser mutante");

        // Verificamos que se haya intentado guardar el ADN en el repositorio
        verify(dnaRepository, times(1)).save(dna);
    } */
}
