package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {

		String pengTxt = showInputDialog("Skriv inn pengesummen: ");
		double peng = Double.parseDouble(pengTxt);
		double betaling;

		double trinn1 = 1441.6;
		double trinn2 = 15086.0;
		double trinn3 = 36434.4;
		double trinn4 = 68408.6;

		if ((peng >= 0) && (peng <= 208050)) {
			showMessageDialog(null, "Det er ikkje trinnskatt for den summen.");

		} else if ((peng >= 208051) && (peng <= 292850)) { // Trinnskatt for Trinn 1 : 1.7%;
			peng -= 208050;
			peng *= 0.017;
			showMessageDialog(null, "Her får du ein trinnskatt på 1.7%. Så du må betale: " + peng + "kr");

		} else if ((peng >= 292851) && (peng <= 670000)) { // Trinnskatt for Trinn 2 : 4.0%;
			peng -= 292850;
			peng *= 0.040;
			betaling = peng + trinn1;
			showMessageDialog(null, "Her får du ein trinnskatt på 4.0%. Så du må betale: " + betaling + "kr");

		} else if ((peng >= 670001) && (peng <= 937900)) { // Trinnskatt for Trinn 3 : 13.6%;
			peng -= 670000;
			peng *= 0.136;
			betaling = peng + trinn1 + trinn2;
			showMessageDialog(null, "Her får du ein trinnskatt på 13.6%. Så du må betale: " + betaling + "kr");

		} else if ((peng >= 937901) && (peng <= 1350000)) { // Trinnskatt for Trinn 4 : 16.6%;
			peng -= 937900;
			peng *= 0.166;
			betaling = peng + trinn1 + trinn2 + trinn3;
			showMessageDialog(null, "Her får du ein trinnskatt på 13.6%. Så du må betale: " + betaling + "kr");

		} else if (peng >= 1350001) { // Trinnskatt for Trinn 5 : 17,6%;
			peng -= 1350000;
			peng *= 0.176;
			betaling = peng + trinn1 + trinn2 + trinn3 + trinn4;
			showMessageDialog(null, "Her får du ein trinnskatt på 13.6%. Så du må betale: " + betaling + "kr");

		} else {
			showMessageDialog(null, "Gyldig tal!");
		}

	}

}
