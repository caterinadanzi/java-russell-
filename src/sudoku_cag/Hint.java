package sudoku_cag;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class Hint implements ActionListener {
	
	private Game current; //oggetto game come istanza
	private JLabel quella; //etichetta 
	//costruttore
	public  Hint(Game g, JLabel l) {
		current=g;
		quella=l;
	}

     public void actionPerformed(ActionEvent e){
    	 
    	 //scorro matrice
    	 for(int c=0; c<9; c++) {
 			for(int r=0; r<9; r++) {
 				 if(current.game[c][r].isEditable()) {
 					 quella.setText("here is your hint: "+ "the number in position "+ (r+1) + ", " + (c+1) +" is " + current.game[c][r].number); 
 					//quando trova una cella in cui il numero inserito è sbagliato o non è ancora stato inserito svela quel numero nella forma qui sopra
 					 break;
 				 }
 			}
 		}
     }
}