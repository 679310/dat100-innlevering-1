package no.hvl.dat100;

/*
 * Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) og skriver verdien til n! ut på skjermen, der n! = 1*2*3* … *(n-1)*n.
 */
public class O3 {

	public static void main(String[] args) {
		int n = 3;
		int b = 1;
		int sluttn;
		int tal;

		sluttn = (n - 1) * n;
		// b = b * (b+1);
		for (int j = 1; j <= sluttn; j++) {
			for (int i = 1; i <= sluttn; i++) {
				int multiple = i * j;
				System.out.println(multiple);
			}
		}

		/*
		 * do { tal = b *2 ; System.out.println(tal); b++; } while (b <= sluttn);
		 */
	}

}
