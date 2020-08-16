import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int providedNumber = scanner.nextInt();
        System.out.print(providedNumber + " ");
        do {
            if (providedNumber == 1) {
                break;
            }
            if (providedNumber % 2 == 0) {
                providedNumber /= 2;
            } else {
                providedNumber = (providedNumber * 3) + 1;
            }
            System.out.print(providedNumber + " ");
        } while(providedNumber!=1);
    }
}