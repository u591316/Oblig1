package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class karakterskale2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 10; i++) {
		String poeng = showInputDialog("Fyll inn hvor mange poeng du fikk på prøven: ");
		
			int poengsum = parseInt(poeng);
			
		
		
		
		 
		if(poengsum <= 100 && poengsum >= 90) {
			showMessageDialog(null, "Karakter A.");
		}else if(poengsum < 90 && poengsum >=  80) {
			showMessageDialog(null, "Karakter B.");
		}else if(poengsum < 80 && poengsum >= 60) {
			showMessageDialog(null, "Karakter C.");
		}else if(poengsum < 60 && poengsum >= 50) {
			showMessageDialog(null, "Karakter D.");
		}else if(poengsum < 50 && poengsum >= 40) {
			showMessageDialog(null, "Karakter E."); 
		}else if(poengsum < 40) {
			showMessageDialog(null, "F"); 
		}
		

		}
		 

	}

}
