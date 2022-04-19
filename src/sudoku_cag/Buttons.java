package sudoku_cag;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Buttons extends JPanel{
	
	private int righe = 3;
	private int colonne = 1;
	
	public Buttons() {
		
		this.setLayout(new GridLayout( righe, colonne)); //CREA UN LAYOUT A GRUGLIA CON NUMERO PREDEFINITO DI RIGHE E COLONNE
		this.setComponentOrientation (ComponentOrientation.LEFT_TO_RIGHT); //L'ORIENTAMENTO DEI COMPONENTI VA DA SX A DX
		this.setPreferredSize(new Dimension(300, 900));
	}

}
