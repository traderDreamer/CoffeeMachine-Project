import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int numberOfParts = scanner.nextInt();
        int[] parts = new int[numberOfParts];

        for (int i=0 ; i < numberOfParts ; i++ ) {
            parts[i] = scanner.nextInt();
        }

        int readyToShip = 0;
        int toCorrect = 0;
        int rejected = 0;

        for (int i=0 ; i < numberOfParts ; i++ ) {
            if (parts[i] == 0 ) {
                readyToShip++;
            } else if  (parts[i] == 1 ) {
                toCorrect++;
            }
            else if (parts[i] == -1 ) {
                rejected++;
            }

        }

        System.out.println(readyToShip + " " + toCorrect + " " + rejected);

    }
}