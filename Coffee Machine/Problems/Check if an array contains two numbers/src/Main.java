import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        boolean nextToEahOther = false;
        int    valN = scanner.nextInt();
        int    valM = scanner.nextInt();


        for (int i=1; i < array.length-1; i++ ) {
            if (array[i] == valN ) {
                if (array[i+1] == valM ||  array[i-1] == valM  ) {
                    nextToEahOther = true;
                    break; }

            }
            if (array[i] == valM ) {
                if (array[i+1] == valN ||  array[i-1] == valN  ) {
                    nextToEahOther = true;
                    break; }

            }
        }

        System.out.println(nextToEahOther);
    }



}