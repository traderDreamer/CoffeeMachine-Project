import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int    startRange = scanner.nextInt();
        int    endRange   = scanner.nextInt();
        StringBuilder builder = new StringBuilder( line);

        System.out.println(builder.substring(startRange,endRange+1));
    }
}