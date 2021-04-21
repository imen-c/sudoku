package be.technifutur.sudoku;

public abstract class Sudoku4x4 implements SudokuInterface {

    private char valeur;
    private boolean occupe;
    private boolean faute;
    private char tableau[][];
    private int ligne =0;
    private int colonne=0;

public Sudoku4x4(int ligne, int colonne){
 tableau = new char[ligne][colonne];
}

    public void addValue(int ligne, int colonne, char valeur)
    { if( isCellValid(ligne,colonne)==true && isValueValid(valeur)==true){
        tableau[ligne][colonne] = valeur;
    }else{
        System.out.println("case occupé ou mauvaise saisie");

    }}
        public char getValue(int ligne, int colonne){
            return tableau[ligne][colonne];
        }

        public boolean isValueValid(char valeur){
             if(1<=valeur||valeur<=4){
                 return true;
             }else{
                 return false;
             }
        }
        public boolean isCellValid ( int ligne, int colonne){
            if (tableau[ligne][colonne]== EMPTY){
                return true;
            }else{
                return occupe;
            }

        }







}
