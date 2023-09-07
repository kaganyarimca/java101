
/*
* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
* */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i = 5, mat, turkce, kimya, muzik, fizik, toplam;
        double avrg;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik ders notunuzu Girin : ");
        mat = input.nextInt();

        System.out.print("Turkçe ders notunuzu Girin : ");
        turkce = input.nextInt();

        System.out.print("Kimya ders notunuzu Girin : ");
        kimya = input.nextInt();

        System.out.print("Müzik ders notunuzu Girin : ");
        muzik = input.nextInt();

        System.out.print("Fizik ders notunuzu Girin : ");
        fizik = input.nextInt();

        toplam = (mat +turkce +fizik +kimya +muzik);

        if ((mat < 0) || (mat> 100)) {
            toplam = toplam - mat;
            i--;
        }
        if ((turkce < 0) || (turkce> 100)) {
            toplam = toplam - turkce;
            i--;
        }
        if ((fizik < 0) || (fizik> 100)) {
            toplam = toplam - fizik;
            i--;
        }
        if ((muzik < 0) || (muzik> 100)) {
            toplam = toplam - muzik;
            i--;
        }
        if ((kimya < 0) || (kimya> 100)) {
            toplam = toplam - kimya;
            i--;
        }

        avrg = (toplam/i);
        System.out.println("Ortalamanız : " + avrg);
        if (avrg >= 55) {
            System.out.println("Sınıfı Geçtiniz ");
        } else {
            System.out.println("Sınıf Tekrar Yapmalısınız!!! ");
        }
    }
}