import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean leap = false;
        int m = scanner.nextInt();
        leap = ( ( m % 4 == 0 ) && !(m % 100 == 0) )  || m % 400 == 0 ;

        String answer = "Regular";
        if ( leap ) {answer = "Leap"; };
        System.out.println( answer );

    }
}