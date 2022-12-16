public class Method {
    public static int [] turnEvenNumbers (int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 ==0) {
                array [i] += 1;
            }
        }
        return new int[]{array[2], array[3], array[4], array[5], array[6]};
    }
}
