import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();

        long n = 1;
        long silnia = 1l;
        while (silnia <= m) {
            silnia *= n;
            // System.out.println("silnia: " + silnia );
            n++;
        }
        System.out.println(n-1);

    }
}