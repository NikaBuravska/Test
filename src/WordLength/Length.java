package WordLength;

public class Length {
    public static void main(String[] args) {

        String word = "Hometask";

        int length = word.length();
        int middle1 = length / 2 - 1;
        //System.out.println( middle1);

        int middle2 = length / 2;
        //System.out.println( middle2);

        String middleChars = word.substring(middle1,middle2+1);
        System.out.println(middleChars);
    }
}

