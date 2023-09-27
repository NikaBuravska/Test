
package CheckOdd;
import java.util.Scanner;

public class CheckOddEven {
    public static void main (String [] args){

        Scanner myObject = new Scanner(System.in);  //cтворили об'єкт сканера
        int number;

        System.out.println("Enter Number: ");
        number = myObject.nextInt();

        if(number % 2 == 0){
            System.out.println("It is Even Number");
        } else {
            System.out.println("It is Odd Nymber");
        }

        System.out.println("BYE");
        myObject.close();

    }

}