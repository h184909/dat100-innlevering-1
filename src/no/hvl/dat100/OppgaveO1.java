package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaveO1 {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= n; i++) {

			int poengsum = parseInt(showInputDialog("Skriv inn poengsum: "));
			
			while (poengsum <0 || poengsum >100) {
				System.out.println("Ugyldig poengsum!");
				poengsum = parseInt(showInputDialog("Skriv inn poengsum på nytt: "));
			}

			if (poengsum >= 90 && poengsum <= 100) {
				System.out.println("Studenten har oppnådd karakteren A!");
			} else if (poengsum >= 80 && poengsum <= 89) {
				System.out.println("Studenten har oppnådd karakteren B!");
			} else if (poengsum >= 60 && poengsum <= 79) {
				System.out.println("Studenten har oppnådd karakteren C!");
			} else if (poengsum >= 50 && poengsum <= 59) {
				System.out.println("Studenten har oppnådd karakteren D!");
			} else if (poengsum >= 40 && poengsum <= 49) {
				System.out.println("Studenten har oppnådd karakteren E!");
			} else if (poengsum >= 0 && poengsum <= 39) {
				System.out.println("Studenten har oppnådd karakteren F!");
			 	}
			}
		}
	}