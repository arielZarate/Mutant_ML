package level_1;

public class DetectorMutante {

  int countSequence = 0;
    /*
     * 
     * ha pedido que crees un programa con un método o función con la siguiente
     * firma
     * Sabrás si un humano es un mutante si encuentras más de una secuencia de
     * cuatro letras idénticas, ya sea en diagonal, horizontal o vertical.
     * String[]dna={"ATGCGA","CAGTGC","TTATGT","CCCCTA","TCACTG"}: En el caso n, al
     * llamar a la función isMutant(dna) se devuelve verdadero.
     */

    // nota : dna[0].charAt(0); // Esto devolverá 'A', que es el primer carácter de
    // "ATGCGA"

    // para no crea clases estatico
    public static boolean isMutant(String[] dna) {
     int countSequence=0;



     //filas horizontales 
        for (int i = 0; i < dna.length; i++) {

            for (int j = 0; j < dna[i].length() - 3; j++) { 
                if (dna[i].charAt(j) == dna[i].charAt(j + 1) &&
                        dna[i].charAt(j) == dna[i].charAt(j + 2) &&
                        dna[i].charAt(j) == dna[i].charAt(j + 3)) {
                    countSequence++;
                    if (countSequence > 1) return true; 

                }
            }
        }

        // secuencia vertical

        for (int i = 0; i < dna.length - 3; i++) {
            for (int j = 0; j < dna[i].length(); j++) {
                if (dna[i].charAt(j) == dna[i + 1].charAt(j) &&
                        dna[i].charAt(j) == dna[i + 2].charAt(j) &&
                        dna[i].charAt(j) == dna[i + 3].charAt(j)) {
                            countSequence++;
                            if (countSequence > 1) return true; // Corta si se encuentran más de una secuencia

                }

            }
        }



            // Verificar secuencias diagonales descendentes (izquierda a derecha)
            for (int i = 0; i < dna.length - 3; i++) {
                for (int j = 0; j < dna[i].length() - 3; j++) {
                    if (dna[i].charAt(j) == dna[i + 1].charAt(j + 1) &&
                        dna[i].charAt(j) == dna[i + 2].charAt(j + 2) &&
                        dna[i].charAt(j) == dna[i + 3].charAt(j + 3)) {
                            countSequence++;
                            if (countSequence > 1) return true; // Corta si se encuentran más de una secuencia
                    }
                }
            }
    
            // Verificar secuencias diagonales ascendentes (derecha a izquierda)
            for (int i = 3; i < dna.length; i++) {
                for (int j = 0; j < dna[i].length() - 3; j++) {
                    if (dna[i].charAt(j) == dna[i - 1].charAt(j + 1) &&
                        dna[i].charAt(j) == dna[i - 2].charAt(j + 2) &&
                        dna[i].charAt(j) == dna[i - 3].charAt(j + 3)) {
                            countSequence++;
                            if (countSequence > 1) return true; // Corta si se encuentran más de una secuencia
                    }
                }
            }

       
            return false;

        

    }

}