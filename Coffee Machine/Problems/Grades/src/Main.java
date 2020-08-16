import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int numberOfGrades = scanner.nextInt();
        int[] parts = new int[numberOfGrades];

        for (int i=0 ; i < numberOfGrades ; i++ ) {
            parts[i] = scanner.nextInt();
        }

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        for (int i=0 ; i < numberOfGrades ; i++ ) {
            if (parts[i] == 5 ) {
                A++;
            } else if  (parts[i] == 4 ) {
                B++;
            }
            else if (parts[i] == 3 ) {
                C++;
            }
            else if (parts[i] == 2 ) {
                D++;
            }

        }

        System.out.println(D + " " + C + " " + B + " " + A);


    }
}