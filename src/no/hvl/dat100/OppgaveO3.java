package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaveO3 {

	public static void main(String[] args) {
		int n = parseInt(showInputDialog("Skriv inn heltall n > 0:"));

		if (n>0) {
			long fakultet = 1;
			for (int i = 1; i <= n; i++) {
				fakultet = fakultet*i;
			}
		System.out.println("Verdien av " + n + "! er: " + fakultet);
		}
		else {
			System.out.println("Heltallet må vær større enn 0!");
		}
	}
}
