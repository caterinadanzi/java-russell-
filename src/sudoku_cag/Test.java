package sudoku_cag;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test {

	public static void main(String[] args) {
		
		Game g1=new Game();
		g1.Initialize();
		
		//CREO LA FINESTRA
		JFrame frame = new JFrame ("AMAZING SUDOKU");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100,50);

		//CREO IL PENNALLO NELLA FINESTRA CHE SERVIRA' PER AGGIUNGERE GLI ALTRI OGGETTI GRAFICI
		JPanel first = new JPanel (new BorderLayout());
		first.setBackground(new Color(176,220,222));
		first.setPreferredSize(new Dimension (1300, 1000));
		
		//CREO un'etichetta con il titolo
		
		JLabel label1 = new JLabel ("SOLVE THE SUDOKU");
		label1.setForeground(Color.BLACK);
		label1.setFont(new Font("ITALIC", Font.BOLD, 24));
		label1.setHorizontalAlignment(JLabel.CENTER);
		
		//creo un'etichetta  per gli indizi 
		JLabel help= new JLabel();
		help.setText("here is your hint");
		help.setForeground(Color.black);
		
		//creo un pannello con struttura a griglia su cui inserire i bottoni
		Buttons b= new Buttons();
		
		//bottone per indizi
		JButton hint = new JButton("Push for a hint!!");
		hint.setForeground(Color.white);
		hint.setBackground(new Color (153, 51, 255));
		hint.addActionListener(new Hint(g1,help)); //gli associo questo listener (vedi Hint)
		
		//bottone per cambiare sudoku
		JButton newgame= new JButton("new game");
		newgame.setForeground(Color.white);
		newgame.setBackground(new Color (178, 102, 255));
		newgame.addActionListener(new Newgame(g1,help));//gli associo questo listener (vedi Newgame)
       
		//bottone per riiniziare lo stesso sudoku da capo
		JButton clean= new JButton ("clean");
	    clean.setForeground(Color.white);
	    clean.setBackground(new Color (204, 153, 255));
	    clean.addActionListener(new Clean(g1));//gli associo questo listener (vedi Clean)
	    //gli aggiungo al panel b
	    b.add (hint, BorderLayout.EAST);
		b.add (newgame, BorderLayout.WEST);
		b.add (clean, BorderLayout.NORTH);
		
		//faccio un secondo pannello su cui metterò la jlabel dei suggerimenti
		
		JPanel second = new JPanel ();
		second.setBackground(new Color(176,196,222));
		second.setBounds(650, 100, 300, 50);
		second.add(help);
		
		//aggiungo il pannello game al frame specificandone la posizione e le dimensioni (che poi eran gia definite)
		g1.setBounds(50, 80, 540, 540);
		frame.add(g1);
		
		first.add(label1, BorderLayout.PAGE_START ); //aggiungo titolo al pannello first
		first.add(b, BorderLayout.EAST ); //la griglia di bottoni al pannello first
		frame.add(second, BorderLayout.CENTER); //aggiungo il pannello con la scritta per gli indizi al frame

		frame.getContentPane().add(first); //metto il primo pannello nel frame
		frame.pack();
		frame.setVisible(true);

	}

}
