package sudoku_cag;

public class Solution {
	
	   int[][] numbers = new int[9][9]; //matrice per numeri 
	   boolean[][] isShown = new boolean[9][9]; //matrice di boolean che determinano la visibilità del numero corretto all'interno della cella
	   public int i=1; //indice per indirizzare ad uno dei 4 sudoku (sotto)
	   
	   //costruttore 
	   public Solution() {
	      super();  
	   }

	   public void newSoluzione() {
	      //in base all'indice i, che verrà modificato quando si preme il pulsante new game, associa dei valori agli elementi dei due vettori
		  if(i==1) {
			  int[][] Sudoku =
			         {{5, 3, 4, 6, 7, 8, 9, 1, 2},
			          {6, 7, 2, 1, 9, 5, 3, 4, 8},
			          {1, 9, 8, 3, 4, 2, 5, 6, 7},
			          {8, 5, 9, 7, 6, 1, 4, 2, 3},
			          {4, 2, 6, 8, 5, 3, 7, 9, 1},
			          {7, 1, 3, 9, 2, 4, 8, 5, 6},
			          {9, 6, 1, 5, 3, 7, 2, 8, 4},
			          {2, 8, 7, 4, 1, 9, 6, 3, 5},
			          {3, 4, 5, 2, 8, 6, 1, 7, 9}};

			      for (int c = 0; c < 9; c++) {
			    	  for (int r = 0; r < 9; r++) {
			    		  numbers[c][r] = Sudoku[c][r];
				      }
				  }
			      
			      boolean[][] Shown =
				         {{true, false, true, false, true, false, true, true, true},
				          {false, true, true, false, false, true, true, true, false},
				          {false, true, false, true, false, true, true, false, true},
				          {true, true, false, false, true, true, false, true, true},
				          {false, true, false, false, false, true, true, false, true},
				          {false, false, true, true, false, true, false, true, true},
				          {true, false, true, true, true, true, false, false, true},
				          {false, true, true, true, false, false, true, true, false},
				          {false, false, true, false, true, false, true, false, true}};

				      for (int c = 0; c < 9; c++) {
				    	  for (int r = 0; r < 9; r++) {
				    		  isShown[c][r] = Shown[c][r];
					      }
					  }
		  }
		  if(i==2) {
			  int[][] Sudoku =
			         {{5, 3, 9, 1, 6, 8, 7, 2, 4},
			          {7, 4, 6, 3, 5, 2, 8, 1, 9},
			          {8, 2, 1, 9, 4, 7, 6, 3, 5},
			          {2, 5, 3, 4, 7, 6, 9, 8, 1},
			          {9, 8, 7, 5, 1, 3, 4, 6, 2},
			          {1, 6, 4, 2, 8, 9, 5, 7, 3},
			          {3, 7, 2, 6, 9, 4, 1, 5, 8},
			          {6, 9, 5, 8, 2, 1, 3, 4, 7},
			          {4, 1, 8, 7, 3, 5, 2, 9, 6}};

			      for (int c = 0; c < 9; c++) {
			    	  for (int r = 0; r < 9; r++) {
			    		  numbers[c][r] = Sudoku[c][r];
				      }
				  }
			      
			      boolean[][] Shown =
				         {{true, false, false, false, true, false, true, false, true},
				          {true, false, false, true, false, false, false, true, true},
				          {true, true, false, true, false, true, true, false, true},
				          {true, false, false, false, true, true, false, true, true},
				          {true, false, true, true, false, false, false, true, true},
				          {true, true, true, true, false, false, true, true, false},
				          {false, false, true, false, false, true, true, false, true},
				          {false, false, true, false, false, false, false, true, false},
				          {true, true, false, false, false, true, true, false, true}};

				      for (int c = 0; c < 9; c++) {
				    	  for (int r = 0; r < 9; r++) {
				    		  isShown[c][r] = Shown[c][r];
					      }
					  }
		  }
		  if(i==3) {
			  int[][] Sudoku =
			         {{5, 3, 9, 8, 7, 6, 4, 1, 2},
			          {7, 2, 8, 3, 1, 4, 9, 6, 5},
			          {6, 4, 1, 2, 9, 5, 7, 3, 8},
			          {4, 6, 2, 5, 3, 9, 8, 7, 1},
			          {3, 8, 5, 7, 2, 1, 6, 4, 9},
			          {1, 9, 7, 4, 6, 8, 2, 5, 3},
			          {2, 5, 6, 1, 8, 7, 3, 9, 4},
			          {9, 1, 3, 6, 4, 2, 5, 8, 7},
			          {8, 7, 4, 9, 5, 3, 1, 2, 6}};

			      for (int c = 0; c < 9; c++) {
			    	  for (int r = 0; r < 9; r++) {
			    		  numbers[c][r] = Sudoku[c][r];
				      }
				  }
			      
			      boolean[][] Shown =
				         {{true, true, false, false, false, true, true, false, false},
				          {true, false, false, true, false, false, false, true, true},
				          {false, false, false, true, false, true, true, false, true},
				          {true, false, true, false, true, false, true, false, true},
				          {true, false, false, false, true, true, false, true, false},
				          {false, false, true, false, false, true, true, false, true},
				          {false, false, true, false, false, false, false, true, false},
				          {true, false, true, true, false, false, false, true, true},
				          {true, false, true, true, false, false, true, true, false}};

				      for (int c = 0; c < 9; c++) {
				    	  for (int r = 0; r < 9; r++) {
				    		  isShown[c][r] = Shown[c][r];
					      }
					  }
		  }
		  if(i==4) {
			  int[][] Sudoku =
			         {{6, 9, 2, 5, 7, 8, 1, 3, 4},
			          {5, 1, 7, 4, 9, 3, 2, 6, 8},
			          {4, 8, 3, 1, 6, 2, 7, 5, 9},
			          {1, 7, 9, 8, 5, 6, 4, 2, 3},
			          {3, 6, 8, 9, 2, 4, 5, 7, 1},
			          {2, 4, 5, 7, 3, 1, 8, 9, 6},
			          {7, 5, 1, 6, 8, 9, 3, 4, 2},
			          {9, 3, 4, 2, 1, 7, 6, 8, 5},
			          {8, 2, 6, 3, 4, 5, 9, 1, 7}};

			      for (int c = 0; c < 9; c++) {
			    	  for (int r = 0; r < 9; r++) {
			    		  numbers[c][r] = Sudoku[c][r];
				      }
				  }
			      
			      boolean[][] Shown =
				         {{true, false, false, false, true, false, false, true, true},
				          {false, false, false, false, true, false, true, false, true},
				          {true, false, true, true, false, false, false, true, false},
				          {false, true, true, false, false, true, false, false, true},
				          {false, true, false, false, false, false, true, true, false},
				          {true, true, false, false, false, true, true, true, false},
				          {false, true, false, false, false, true, false, false, true},
				          {true, false, true, false, true, false, false, false, false},
				          {false, true, false, false, true, false, false, false, true}};

				      for (int c = 0; c < 9; c++) {
				    	  for (int r = 0; r < 9; r++) {
				    		  isShown[c][r] = Shown[c][r];
					      }
					  }
		  }
	      
	   }
	

}
