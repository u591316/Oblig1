package no.hvl.dat100;
import static javax.swing.JOptionPane.*; 
import static java.lang.Double.*; 

public class Trinnskatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InputDialog som brukeren fyller inn sin inntekt i
		String inntektTxt = showInputDialog("Skriv inn din inntekt i 2019: " );
			double inntekt = parseDouble(inntektTxt); 			//Gjør om stringen fra brukeren til en double
			double frikort = 0;
			double sats1 = 0.0093;
			double sats2 = 0.0241;				// % satsen man må skatte 
			double sats3 = 0.1152;
			double sats4 = 0.35;
			double trinnSkatt = 0; 
			
		if(inntekt >= 164100 && inntekt <= 230950) { 
		 trinnSkatt = inntekt * sats1; 
			
		} else if (inntekt >230950 && inntekt <=580650) {
			trinnSkatt = inntekt * sats2;
			
		}else if (inntekt > 580650 && inntekt <=943050) {   // else if grein, hvis ikke ville den automatisk gjort neste else grein etter
			trinnSkatt = inntekt * sats3;					// if setningen 
			
		}else if (inntekt > 943050) {
			trinnSkatt = inntekt * sats4;
		}else if (inntekt < 164100) {
			trinnSkatt = inntekt * frikort;
		}
			
		showMessageDialog(null, "Skattetrekk:  " + trinnSkatt + "kr"); 
		
		
	}

}
