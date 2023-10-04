package homework4;
import java.util.Scanner;

public class CheckOddEven {
    public static void main (String [] args){

        Scanner myScanner = new Scanner(System.in);
        int number;

        System.out.println("Enter Number: ");
        number = myScanner.nextInt();

        if(number % 2 == 0){
            System.out.println("It is Even Number");
        } else {
            System.out.println("It is Odd Nymber");
        }

        System.out.println("BYE");
        myScanner.close();

    }

}