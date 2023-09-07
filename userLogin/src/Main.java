import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, answer, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.print(" Kullanıcı Adınızı Giriniz .: ");
        userName = input.nextLine();
        System.out.print(" Şifrenizi Girinz .: ");
        password = input.nextLine();

        if (userName.equals("üniversite") && password.equals("asdfg123")) {
            System.out.println("Giris Başarılı.");
        } else if (userName.equals("üniversite") && !(password.equals("asdfg123"))) {
            System.out.println("Şifenizi Sıfırlamak İster misiniz? \n 1-Evet\n 2-Hayır");
            answer = input.nextLine();

            if (answer.equals("1")){
                System.out.print("Yeni Şifre Oluşturunuz : ");
                newPassword = input.nextLine();

                if (newPassword.equals("asdfg123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }else{
                System.out.println("Şifre Oluşturmadınız !");
            }
        }else{
            System.out.println("Girilen Bilgiler Yanlış");
        }
    }
}