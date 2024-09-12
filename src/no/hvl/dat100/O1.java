package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;


public class O1 {

	public static void main(String[] args) {
		/*
		 * En trinnskatt er en progressiv skatt på bruttolønn 
		 * som beregnes når inntekten er høyere enn 208 050 kr.
		 * 
		 * Se https://www.skatteetaten.no/satser/trinnskatt/?year=2024#rateShowYear for aktuelle satser.
		 * Lag et program som leser inn bruttoinntekt, beregner 
		 * og skriver ut trinnskatten dvs. det beløpet som personen 
		 * skal betale i trinnskatt.
		 * 
		 * inntekt mellom 0 - 208050kr   ingen skatt
		 *
		 * trinn 1 inntekt mellom 208 051 - 292 850kr 1,7% skatt
		 * 
		 * trinn 2 inntekt mellom 292 851 - 670 000kr 4,0% skatt
		 * 
		 * trinn 3 inntekt mellom 670 001 - 937 900kr 13,6% skatt
		 * 
		 * trinn 4 inntekt mellom 937 901 - 1 350 000 16,6% skatt
		 * 
		 * trinn 5 inntekt fom. 1 350 001 -           17,6% skatt
		 * 
		 * Skatten baregnes til et helt tall.
		 * 
		 */

		int lønn = parseInt(showInputDialog("Hva er din brutto lønn? "));
		
		if (lønn <= 208050) {
			showMessageDialog(null, "Du betaler ikke skatt.");
		} else if (lønn >= 208051 && lønn <= 292850) {
			double skatt = (lønn * 0.017) + 0.5;
			int endeligSkatt = (int) skatt;			// konverterer fra desimal- til heltall
			showMessageDialog(null, "Trinn 1\n Din skatt er beregnet til: " + endeligSkatt + "kr");
		} else if (lønn >= 292851 && lønn <= 670000) {
			double skatt = (lønn * 0.04) + 0.5;
			int endeligSkatt = (int) skatt;
			showMessageDialog(null, "Trinn 2\n Din skatt er beregnet til: " + endeligSkatt + "kr");
		} else if (lønn >= 670001 && lønn <= 937900) {
			double skatt = (lønn * 0.136) + 0.5;		// + 0.5 for å runde opp
			int endeligSkatt = (int) skatt;
			showMessageDialog(null, "Trinn 3\n Din skatt er beregnet til: " + endeligSkatt + "kr");
		} else if (lønn >= 937901 && lønn <= 1350000) {
			double skatt = (lønn * 0.166) + 0.5;
			int endeligSkatt = (int) skatt;
			showMessageDialog(null, "Trinn 4\n Din skatt er beregnet til: " + endeligSkatt + "kr");
		}else if (lønn >= 1350001) {
			double skatt = (lønn * 0.176) + 0.5;
			int endeligSkatt = (int) skatt; 
			showMessageDialog(null, "Trinn 5\n Din skatt er beregnet til: " + endeligSkatt + "kr");
		}

	}

}
