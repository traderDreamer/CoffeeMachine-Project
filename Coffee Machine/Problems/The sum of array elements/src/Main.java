import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        short size = scanner.nextShort();

        int[] array = new int[size];

        for (int i=0; i < array.length; i++ ) {
            array[i] = scanner.nextInt();
        }

        int sum =0;
        for (int num: array
            ) {
            sum += num;
        }

        System.out.println(sum);
    }
}