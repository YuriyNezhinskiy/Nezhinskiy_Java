import java.util.Scanner;

public class Massif_of_numbers {
    public static void main(String[] args) {
        int[] array = {1, 8, 2, 3, 319, 6, 9, 210, 12, 333,15, 33, 18, 11, 21};

        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}