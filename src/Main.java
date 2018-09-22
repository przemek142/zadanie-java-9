public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 7, 9};
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0 || i == 2 || i == 4) {
                result += numbers[i];
//                System.out.println(numbers[i]);
            }
        }

        System.out.println("Wynik= " + result);
    }
}
