import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // hata toleransı = 3
        // bakiye =1500

        String username, password;
        int right=3;
        int select;
        int balance = 1500;

        Scanner input = new Scanner(System.in);

        while (right > 0){
            System.out.print("Kullanıcı adınız: ");
            username = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();
            if(username.equals ("university") && password.equals("qwert321")){
                System.out.println("Hoşgeldiniz.");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarınız:  ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para Miktarınız: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz Yetersiz!");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz: " + balance);
                            break;
                    }
                }
                while (select != 4);
                System.out.println("İyi günler.");
                break;
            }else{
                right--;
                System.out.println("Hatalı Giriş!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur, yetkili kişiler ile iletişime geçiniz!!!.");
                } else {
                    System.out.println("Kalan Giriş Hakkınız : " + right);
                }
            }
        }
    }
}