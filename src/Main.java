import java.util.Arrays;

public class Main {
    public static void main (String[]args) {
        int [] array = new int [] {1,2,3,4,5,6,7,8,9,10};
        int [] exactNumbers = Method.turnEvenNumbers(array);
        System.out.println(Arrays.toString(exactNumbers));
    }
}