import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            int n1, n2, secme;

            Scanner input = new Scanner(System.in);
            System.out.print("Birinci sayi : ");
            n1 = input.nextInt();

            System.out.print("İkinci sayi : ");
            n2 = input.nextInt();

            System.out.println("1-Toplama \n 2-Çıkarma \n3-Çarpma\n4-Bölme");
            System.out.println("İşlemi seçiniz:");
            secme = input.nextInt();

            switch (secme){

                case 1:
                    System.out.println("Toplam : " + (n1+ n2));
                    break;

                case 2:
                    System.out.println("Cıkarma : " + (n1 - n2));
                    break;

                case 3:
                    System.out.println("Çarpma :" + (n1 * n2));
                    break;

                case 4:
                    if (n2!=0) {
                        System.out.println("Bölme : " + (n1 / n2));
                    } else {
                        System.out.println("Herhangi bir sayı sıfıra bölünemez!!! ");
                    }
                    break;

                default:
                    System.out.println("Yanlış Seçim. Tekrar Deneyin.!");
                    break;
            }

        }
}