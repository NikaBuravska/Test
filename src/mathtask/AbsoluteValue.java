package mathtask;

public class AbsoluteValue {
    public static void main(String[] args) {

        int absNum1 = Math.abs(15);
        int absNum2 = Math.abs(15);

        if (absNum1 > absNum2) {
            System.out.println(absNum1 + " absolute value ");
        } else if (absNum2 > absNum1) {
            System.out.println(absNum2 + " absolute value ");
        } else {
            System.out.println(" the same values ");
        }
    }
}