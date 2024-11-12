package level_1;

public class DetectorMutante {

    static int countSequence = 0;
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

    // para no cerar clases estatico
    public static void isMutant(String[] dna) {
        boolean mutant = false;
        for (int i = 0; i < dna.length; i++) {

 
            for (int j = 0; j < dna[i].length() - 3; j++) { // -3 para evitar desbordar el índice
                if (dna[i].charAt(j) == dna[i].charAt(j + 1) &&
                        dna[i].charAt(j) == dna[i].charAt(j + 2) &&
                        dna[i].charAt(j) == dna[i].charAt(j + 3)) {
                    mutant = true;
                    // return mutant; // Retorna inmediatamente si encuentra la secuencia

                }
            }
        }

        if (mutant == true) {
            System.out.println("es mutante ");
        }
        else{
            System.out.println("es humano");
        }

    }

}