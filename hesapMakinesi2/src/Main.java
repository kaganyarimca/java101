
import java.util.Scanner;
public class Main {
    static int sum(int a, int b){
        int result = a+b;
        System.out.println("Toplamları: "+result);
        return  result;
    }
    static  int min(int a, int b){
        int result = a-b;
        System.out.println("Çıkan sonuç " + result);
        return  result;
    }
    static int times(int a, int b){
        int result = a*b;
        System.out.println("Çarpımları: "+result);
        return  result;
    }
    static int divided(int a, int b){
        if(b==0){
            return  0;
        }
        int result = a/b;
        System.out.println("Bölümleri: "+ result);
        return  result;
    }
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return  result;
    }
    static  int mod(int a, int b){
        return a%b ;
    }
    static  void calcRectangle(int a, int b){
        System.out.println("çevresi: "+ 2*(a+b));
        System.out.println("Alanı: "+ (a*b));
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;

        String menü = "\n1- Toplama işlemi\n"
                + "2 - Çıkarma işlemi\n"
                + "3 - Çarpma işlemi\n"
                + "4 - Bölme işlemi\n"
                + "5 - Üslü sayi hesaplama işlemi\n"
                + "6 - Mod alma işlemi\n "
                + "7 - Dikdörtgenin alanını bulma ve çevresini bulma.\n"
                + "0 - Çıkış yap!.";

       while (true){
           System.out.println(menü);
           System.out.println("Bir işlem seçiniz: ");
           select =input.nextInt();

           if(select == 0){
               break;
           }
               System.out.println("1. sayıyı giriniz:");

           int a =input.nextInt();
           System.out.println("2. sayıyı giriniz:");

           int b= input.nextInt();
           int result = 0;

           switch (select){
               case 1:
                   sum(a,b); break;

               case 2:
                   min(a,b); break;
               case 3:
                   times(a,b); break;
               case 4:
                   if (divided(a,b)  == 0) {
                       System.out.println("ikinci sayı 0 dan farklı olmalı.");
                   } break;
               case 5:
                   System.out.println("Üs işleminin sonucu:"+power(a,b)); break;
               case 6:
                   System.out.println("Mod işleminin sonucu:"+ mod(a,b));
                   break;
               case 7:
                   calcRectangle(a,b ); break;
               default:
                   System.out.println("Geçersiz işlem girdiniz:");

           }


            }
    System.out.println("tekrar bekleriz!");


    }
}