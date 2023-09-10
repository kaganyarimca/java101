import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number= random.nextInt(100);

        // int number = (int)(Math.random()*100); // type casting

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];

        while(right < 5){
            System.out.println("Enter your guessed number:");
            selected = input.nextInt();

            if(selected < 0 || selected > 99 ){
                System.out.println("Please enter numbers in the range of 0-100.");
                continue;
            }

            if(selected == number){
                System.out.println("Correct guess, Your number is: "  + number);
                break;
            }
            else {
                wrong[right] = right;

                System.out.println("Entered the wrong number.");
                if(selected > number){
                    System.out.println("The number" + selected + " is greater than secret number.");
                }else{
                    System.out.println("The number " + selected + " is lower than secret number.");
                }

                right ++;
                System.out.println("Remaining rights: " + (5-right));
            }

        }
    }
}