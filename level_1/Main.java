package level_1;

public class Main {
    public static void main(String[] args) {

        DetectorMutante dm = new DetectorMutante();
        String[] dna = { "ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG" };
        String[] otro = { "ATGCGA"  };

      //  DetectorMutante.isMutant(dna);
    if( DetectorMutante.isMutant(dna))
        {
            System.out.println("\n true");
        }
        else {
            System.out.println("\n false");
        } 




        System.out.println("\n ************ Programa finalizado con exito!! *****************");

    }



    

}
