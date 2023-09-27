package TriangleTask;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        System.out.println("Enter 1 side: ");
        int side1 = myObject.nextInt();

        System.out.println("Enter 2 side: ");
        int side2 = myObject.nextInt();

        System.out.println("Enter 3 side: ");
        int side3 = myObject.nextInt();


        if (side1 == side2 && side1 == side3 && side2 == side3) {
            System.out.println("Triangle is isosceles");
        } else {
            System.out.println("Triangle is not isosceles");
        }
        myObject.close();

    }
}
