import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int providedNumber = scanner.nextInt();

        int i = 1;
        int squere = 0;
        do  {
            squere = i * i;
            i++;
            System.out.println(squere);
        } while (i * i <= providedNumber);


    }
}
