package sudoku_cag;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JPanel{
	
	//istanze statiche di tipo intero per il totale delle celle sia in orizz che vert nella griglia, e per quello di una porzione della griglia da 3x3
	public static final int total=9;
	public static final int sub=3;
	
	public static final int CELL_SIZE = 60;   //dimensione singola cella
	public static final int BOARD_W  = CELL_SIZE * total; //larghezza gella griglia game
	public static final int BOARD_H = CELL_SIZE * total;  //altezza gella griglia game
	
	public SingleCell[][] game = new SingleCell[total][total];//matrice di celle che costituirà la griglia
	Solution s=new Solution(); //oggetto solution come istanza, serve per collegare il game con i valori assegnati alle celle
	
	//costruttore
	public Game() {
		super.setLayout(new GridLayout(total,total));//layout a griglia per inserimento celle nel pannello game
		
		for(int c=0; c<total; c++) {
			for(int r=0; r<total; r++) {
				game[c][r]=new SingleCell(c,r);//popolo la matrice con celle che poi aggiungo al pannello, assegno gli indici della matrice alle istanze row e colunmn
				super.add(game[c][r]);
				game[c][r].addFocusListener(new SingelCellFocusListener(game[c][r])); 
		        game[c][r].addActionListener(new CellInputListener(game[c][r])); //assegno ad ogni cella creata due actionlistener, uno per quando viene persa dal fuoco, l'altro per quando viene premuto invio
			}
		}
		super.setPreferredSize(new Dimension(BOARD_W, BOARD_H)); //specifico dimensioni del pannello	
	}
	
	//per inizializzare il gioco in base alla soluzione
	public void Initialize() {
		
		s.newSoluzione();//per il riferimento numerico, e se sono mostrati o meno i numeri nelle celle
		for(int c=0; c<total; c++) {
			for(int r=0; r<total; r++) {
				game[c][r].SpecificCell(s.numbers[c][r], s.isShown[c][r]);//a ogni cella della matrice viene associato numero e la variabile Shown(vera o falsa)
			}
		}
	}
	
	//listener per la perdita di fuoco dalla casella dopo inserimento 
	private class SingelCellFocusListener implements FocusListener {
		private SingleCell sourceCell;
		public SingelCellFocusListener(SingleCell sc) {
			this.sourceCell = sc;
		}
		@Override
		public void focusGained(FocusEvent e) {
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			
            int numberIn = Integer.parseInt(this.sourceCell.getText());
            
            if (numberIn == this.sourceCell.number)
            	this.sourceCell.status = 3;
            else 
            	this.sourceCell.status = 4;
            this.sourceCell.paint();
			
		}
		
	}
	
	//listener per inserimento nella casella e invio
	private class CellInputListener implements ActionListener {
		
		private SingleCell sourceCell;
		public CellInputListener(SingleCell sc) {
			this.sourceCell = sc;
		}

         public void actionPerformed(ActionEvent e){
        
             int numberIn = Integer.parseInt(this.sourceCell.getText());
             
             if (numberIn == this.sourceCell.number)
            	 this.sourceCell.status = 3;
             else 
            	 this.sourceCell.status = 4;
             this.sourceCell.paint();

         }
	}
}
