package be.technifutur.sudoku;

public abstract class Sudoku9x9 implements SudokuInterface{

    private char valeur;
    private boolean occupe;
    private boolean faute;
    private char tableau[][];
    private int ligne =0;
    private int colonne=0;

    public Sudoku9x9(){

      tableau= new char [ligne][colonne] ;
    }
    public boolean isCellValid ( int ligne, int colonne){
        if (tableau[ligne][colonne]== EMPTY){
            return true;
        }else{
            return occupe;
        }

    }















}
