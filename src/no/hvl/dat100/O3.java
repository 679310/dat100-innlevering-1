package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

/*
 * Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) og skriver verdien til n! ut på skjermen, der n! = 1*2*3* … *(n-1)*n.
 */

public class O3 {

	public static void main(String[] args) {
		
		int sum = 1;	
		
		String nTxt = showInputDialog("Gi eit heiltal:");
		int n = parseInt(nTxt);
		

		for (int i = n; i >= 1; i--) {
			sum = sum * i;
		}
		
		String txt = "Den totale summen er: " + sum;
		showMessageDialog(null, txt);
	}

}
