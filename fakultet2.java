package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class fakultet2 {

	public static void main(String[] args) {
		//5! = 5 * 4 * 3 * 2 * 1 = 120
				String n = showInputDialog("skriv inn et tall: ");
					long n1 = parseInt(n);
				System.out.println(factorial(n1));
				

			}
			public static long factorial(long n1) {
				if(n1 == 1) {
					return 1;
				}else {
					
				return n1 * factorial(n1 - 1);  
					
			}

		}
		}