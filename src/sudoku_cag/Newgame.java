package sudoku_cag;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Newgame implements ActionListener {
	
	private Game current;
	private JLabel quella;
	public  Newgame(Game g, JLabel l) {
		current=g;
		quella=l;
	}

     public void actionPerformed(ActionEvent e){
    	 //cambia l'istanza i del game in base ed in base ad essa riinizializza il gioco (in questo modo scorrono i 4 disponibili)
    	  if(current.s.i==4)current.s.i=1;  
    	  else current.s.i++;
    	  current.Initialize();
    	  quella.setText("here is your hint "); //fa tornare la scritta della label per i suggerimenti a come ra prima dell'inizio del gioco
     }
}

