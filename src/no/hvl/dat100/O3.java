package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		/*
		 * Lag et program som leser inn et heltall n > 0, beregner verdien n! (n
		 * fakultet) og skriver verdien til n! ut på skjermen, der n! = 1*2*3* …
		 * *(n-1)*n. 
		 * 
		 */
		
		
		int tallN = parseInt(showInputDialog("Skriv inn et heltall N: ")); //input 


		if (tallN <= 0) {
			showMessageDialog(null, "N må være større enn 0.");   // 
			return; 
		}

		
		long fakultet = 1;
		for (int i = 1; i <= tallN; i++) {
			fakultet = fakultet * i;
		}

		showMessageDialog(null, "Verdien av " + tallN + "! er " + fakultet);
		
		 }
	}


	


