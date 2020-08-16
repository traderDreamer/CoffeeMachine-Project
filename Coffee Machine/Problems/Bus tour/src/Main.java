import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int hight = scanner.nextInt();
        int size = scanner.nextShort();
        boolean willPass = true;

        int[] array = new int[size];

        for (int i=0; i < array.length; i++ ) {
            array[i] = scanner.nextInt();
        }

        for (int i=0; i < array.length; i++ ) {
           if ( array[i] <= hight ) {
               int bridge = i + 1;
               System.out.println("Will crash on bridge " + bridge );
               willPass = false;
               break;
           }
        }

        if (willPass) {
            System.out.println("Will not crash");
        }

    }
}