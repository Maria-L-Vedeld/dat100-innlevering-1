package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {

			int poengsum = parseInt(showInputDialog("[" + i + "]\n Din poengsum: "));

			if (90 <= poengsum && poengsum <= 100) {
				showMessageDialog(null, "A");
			} else if (80 <= poengsum && poengsum <= 89) {
				showMessageDialog(null, "B");
			} else if (60 <= poengsum && poengsum <= 79) {
				showMessageDialog(null, "C");
			} else if (50 <= poengsum && poengsum <= 59) {
				showMessageDialog(null, "D");
			} else if (40 <= poengsum && poengsum <= 49) {
				showMessageDialog(null, "E");
			} else if (0 <= poengsum && poengsum <= 39) {
				showMessageDialog(null, "F");
			}
			if (poengsum < 0 || poengsum > 100) {  // må bruke en if isteden for else for å kunne oppdatere/trekke fra i
				showMessageDialog(null, "Du har oppgitt en ugyldig poengsum.");
				i--;

			}
		}

	}

}
