import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.stream(arr).filter(a -> a%4==0 ).max().getAsInt() );

       // Arrays.sort(arr);
        /*for (int num = size-1 ; num == 0 ; num--) {
            if (arr[num] % 4 == 0) {
                System.out.println(arr[size - 1]);
                break;
            }
        }*/
    }
}