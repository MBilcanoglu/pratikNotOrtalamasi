package pratikNotOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		De�i�kenleri olu�tur
		int mat,fizik,kimya,turkce,tarih,muzik;
		
//		Scanner s�n�f� tan�mla
		Scanner inp=new Scanner(System.in);
		
//		Kullan�c�dan de�erleri al
		System.out.print("Matematik Notunuz: ");
		mat=inp.nextInt();
		
		System.out.print("Fizik Notunuz: ");
		fizik=inp.nextInt();
		
		System.out.print("Kimya Notunuz: ");
		kimya=inp.nextInt();
		
		System.out.print("T�rk�e Notunuz: ");
		turkce=inp.nextInt();
		
		System.out.print("Tarih Notunuz: ");
		tarih=inp.nextInt();
		
		System.out.print("M�zik Notunuz: ");
		muzik=inp.nextInt();
		
		int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
		double sonuc = toplam/6;
		System.out.println(sonuc>60?"Ge�tiniz":"Kald�n�z");
		
	}

}
