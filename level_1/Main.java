package level_1;

public class Main {
    public static void main(String[] args) {

        DetectorMutante dm = new DetectorMutante();
        String[] dna = { "ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG" };
        String[] otro = { "ATTTTGCGA"  };

        DetectorMutante.isMutant(otro);
       /** boolean rtado=  DetectorMutante.isMutant(dna);

        if(rtado==true)
        {
            System.out.println("Es mutante");
        }
        else {
            System.out.println("no es mutante");
        } */

    }

}
