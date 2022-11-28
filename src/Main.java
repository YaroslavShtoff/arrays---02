import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();


//  Задание 1
        int sum = 0;
        for (int paymentPerDay : arr) {
            sum = sum + paymentPerDay;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей ");

        int min = 200_001;
        int max = 99_999;
        for (int paymentPerDay : arr) {
            if (paymentPerDay < min) {
                min = paymentPerDay;
            }
            if (paymentPerDay > max) {
                max = paymentPerDay;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей ");

        // Задача 3

        double  average = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
}