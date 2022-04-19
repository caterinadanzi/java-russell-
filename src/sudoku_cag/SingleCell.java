package sudoku_cag;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class SingleCell extends JTextField{
	
	 private static final Font FONT_NUMBERS = new Font("ITALIC", Font.BOLD, 24);

	 int row, col;  //row per riga, col per colonna (orientamno posizione della cella nella matrice)
	 int number;   // numero CORRETTO che verrà associato in base alla soluzione, NON numero inserito
	 int status; // 1= quella da mostrare, 2=non ancora risolta, 3=risposta corretta, 4=risposta sbagliata

	 //costruttore
	 public SingleCell(int row, int col) {
	    super();   
	    this.row = row;
	    this.col = col;
	    super.setHorizontalAlignment(JTextField.CENTER);
	    super.setFont(FONT_NUMBERS);  
	 }
	 
	 //inizializza le celle assegnando il numero e la variabile status in base alle caratteristiche della soluzione
	 public void SpecificCell(int number, boolean isShown) {
	     this.number = number;
	     if(isShown==true)status=1;
	     else status=2;
	     paint();//richiama funzione sotto
	 }

	 public void paint() {
		 if (status == 1) { 
			  super.setText(number + "");
			  super.setEditable(false);
			  super.setBackground(Color.white);
			  super.setForeground(Color.black);
			  //se la cella è da mostrare (status 1) allora da ad essa queste caratteristiche grafiche e ne mostra il numero  (non sarà editabile)
	     } 
		  
		 if (status == 2) {
			  super.setText("");
			  super.setEditable(true);
			  super.setBackground(new Color(176,196,222));
			  super.setForeground(Color.black);
			  //se la cella non è ancora stata modificata (status 2) allora da ad essa queste caratteristiche grafiche (sarà editabile)
	     } 
		  
		 if (status == 3) {
	    	 super.setEditable(false);
	         super.setBackground(Color.white);
	         super.setForeground(Color.black);
	         //se il numero inserito è corretto (status 3) allora da ad essa queste caratteristiche grafiche (non sarà più editabile)
	     } 
		  
		 if (status == 4) {
	         super.setEditable(true);
	         super.setBackground(Color.white);
	         super.setForeground(new Color(219,112,147));
	        //se il numero inserito non è corretto (status 4) allora da ad essa queste caratteristiche grafiche (sarà ancora editabile)
	     }
	   }

}
