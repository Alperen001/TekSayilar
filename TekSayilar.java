import java.util.Scanner;

public class TekSayilar {

	public static void main(String[] args) {
		int gsayi=0, total = 0;
		Scanner inp = new Scanner(System.in);

		do {
			System.out.println("Lütfen Sayý Giriniz: ");
			gsayi = inp.nextInt();
			if (gsayi % 2 == 0 && gsayi % 4 == 0) {
				total += gsayi;
			}

		} while (gsayi % 2 == 0);
		System.out.println("sayýlarýn toplamý" + total);
	}
}
