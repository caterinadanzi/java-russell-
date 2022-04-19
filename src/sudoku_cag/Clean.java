package sudoku_cag;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clean implements ActionListener {
	
	//ho un'istanza che è un oggetto game
	private Game current;
	//costruttore
	public  Clean(Game g) {
		current=g;
	}

    public void actionPerformed(ActionEvent e){
    	current.Initialize();  //quando il bottone viene premuto il game si riinizializza ai valori iniziali
    }
}
