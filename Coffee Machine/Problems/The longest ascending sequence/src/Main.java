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

        int maxSequence=0;
        int sequence=1;
        for (int i=1; i < array.length; i++ ) {
            if (array[i] > array[i-1]){
                sequence++;
            } else if (
                    array[i] <= array[i-1] ) {
                if (sequence > maxSequence) {
                    maxSequence = sequence;
                    sequence=1;
                        }
            }
        }
        if (sequence > maxSequence) {
            maxSequence = sequence;
        }
        System.out.println(maxSequence);
    }
}