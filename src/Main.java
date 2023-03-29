import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int max = -1;
        int min = 3000000;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        int averageValue = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char m = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = m;
        }
        System.out.print(Arrays.toString(reverseFullName) + " ");
    }
}