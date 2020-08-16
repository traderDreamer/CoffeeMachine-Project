import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ints = new ArrayList<>();
        do  {
            if (scanner.hasNextInt())
                ints.add(scanner.nextInt());
        } while ( ( ints.get(ints.size()-1) != null  ) &&  (ints.get(ints.size()-1) != 0  ) ) ;

        for (int i : ints
        ) {
            if  (i == 0)  {
                break ;
            } else if (i % 2 != 0) {
                System.out.println("odd");
            } else if (i % 2 == 0) {
                System.out.println("even");
            }

        }

    }
}