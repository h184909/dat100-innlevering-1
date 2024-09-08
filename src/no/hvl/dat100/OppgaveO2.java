package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaveO2 {

	public static void main(String[] args) {
		int bruttoinntekt = parseInt(showInputDialog("Bruttoinntekt: "));
		
		if (bruttoinntekt >= 0 && bruttoinntekt <= 208050) {
			System.out.println("Ingen trinnskatt.");
		}
		else if (bruttoinntekt >= 208051 && bruttoinntekt <= 292850) {
			double trinnskatt = bruttoinntekt * 0.017;
			System.out.println("Trinnskatten blir på: " + trinnskatt + "kr.");
		}
		else if (bruttoinntekt >= 292851 && bruttoinntekt <= 670000) {
			double trinnskatt = bruttoinntekt * 0.04;
			System.out.println("Trinnskatten blir på: " + trinnskatt + "kr.");
		}
		else if (bruttoinntekt >= 670001 && bruttoinntekt <= 937900) {
			double trinnskatt = bruttoinntekt * 0.136;
			System.out.println("Trinnskatten blir på: " + trinnskatt + "kr.");
		}
		else if (bruttoinntekt >= 937901 && bruttoinntekt <= 1350000) {
			double trinnskatt = bruttoinntekt * 0.166;
			System.out.println("Trinnskatten blir på: " + trinnskatt + "kr.");
		}
		else if (bruttoinntekt >= 1350001) {
			double trinnskatt = bruttoinntekt * 0.176;
			System.out.println("Trinnskatten blir på: " + trinnskatt + "kr.");
		}
		else {
			System.out.println("Ugyldig tall.");
		}
	}
}