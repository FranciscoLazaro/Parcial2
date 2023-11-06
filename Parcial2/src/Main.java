public class Main {
    public static void main(String[] args) throws letrasEquivocadas {


        String[] dna1 = {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};
        String[] dna2 = {"TAGCAG", "CGATCG", "TTTATG", "AGAGAG", "CCCCTA", "TCACTG"};
        String[] dna3 = {"TAGCAG", "CGATGG", "TATGTG","AGGGAG", "CCCCTA", "TCACTG"};
        String[] dna4 = {"ATGCGA", "CAGTGC", "TTATGT", "AGACGG", "GCGTCA", "TCACTG"};
        String[] dna5 = {"ATGCAA", "CAGTTC", "TTATGT", "AGAAGG", "GCGTCA", "TCACTG"};
        String[] dna6 = {"TAGCAG", "CGATGG", "TATGTG", "AGGGAG", "CTCCTA", "TCACTG"};
        String[] dna7 = {"AHGCGA", "CCGTGC", "TTATGT", "AGAAGG", "CCTCTA", "TCACTG"};
        String[] dna8 = {"ATGCGA", "CAGTGC", "TTATGT", "AGAÑGG", "CCCCTA", "TCACTG"};
        String[] dna9 = {"ATGCGA", "CMGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};
        String[] dna10 = {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACSG"};
    new Diagonales();

    Diagonales.comprobar(dna1);
    Diagonales.comprobar(dna2);
    Diagonales.comprobar(dna3);
    Diagonales.comprobar(dna4);
    Diagonales.comprobar(dna5);
    Diagonales.comprobar(dna6);
    Diagonales.comprobar(dna7);
    Diagonales.comprobar(dna8);
    Diagonales.comprobar(dna9);
    Diagonales.comprobar(dna10);
    }


}