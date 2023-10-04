package homework4;

public class Length {
    public static void main(String[] args) {

        String word = "Home";

        int length = word.length();

        int beginIndex = length / 2-1;
        int endIndex = length / 2+1;


        String middleChars = word.substring(beginIndex,endIndex);
        System.out.println(middleChars);
    }
}

