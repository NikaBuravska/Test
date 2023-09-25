public class Main {
    public static void main(String[] args) {

        System.out.println("Слава Україні!");

        int celsiumValue = -5;
        float fahrenValue = ((celsiumValue * 9)/5)+32F;
        float kelvinValue = (float) (celsiumValue + 273.16);
        int sideA = 5;
        int sideB = 2;
        int areaTr = (sideA * sideB)/2;



        System.out.println(celsiumValue+" "+"Celsius");
        System.out.println(fahrenValue+" "+"Fahrenheit");
        System.out.println(kelvinValue+" "+"Kelvin");
        System.out.println(areaTr + " "+"Triange's area");



    }
}