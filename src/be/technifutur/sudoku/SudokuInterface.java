package be.technifutur.sudoku;

public interface SudokuInterface{

   char EMPTY =' ';

   public void addValue(int ligne,int colonne, char valeur);

   public char getValue(int ligne,int colonne);

   public boolean isValueValid(char Valeur);

   public boolean isCellValid(int ligne, int colonne);

    }

