import java.util.Scanner;

public class Dongu {
	public static void main(String[] args) {
		int k, adet=0, toplam=0, i=1;
		double ortalama;
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		k  = input.nextInt();
		
		while(i<=k) {
			if((i%3 == 0) && (i%4 == 0)) {
				System.out.println(i);
			toplam=toplam+i;
			adet++;
			}
			i++;
		}
		ortalama=toplam/adet;
		System.out.println("Ortalamaniz: " + ortalama);
	}
}