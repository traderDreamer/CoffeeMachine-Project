import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        System.out.println( line.endsWith("burg") );
    }
}