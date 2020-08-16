import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num;
        int nextNumber = -1;
        boolean isNaturalOrder=true;
        boolean ascendingOrder=false;
        boolean descendingOrder=false;


        while (scanner.hasNext()) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }


            nextNumber++;
            ints.add(num);

            if (ints.size() > 1
                    && ascendingOrder == false && descendingOrder == false
            ) {
                if ((ints.get(nextNumber) > ints.get(nextNumber - 1))) {
                    ascendingOrder = true;
                }
                if (ints.get(nextNumber) < ints.get(nextNumber - 1)) {
                    descendingOrder = true;
                }
            }
            if (ints.size() > 1 ) {
                if ( ascendingOrder == true && (ints.get(nextNumber) < ints.get(nextNumber - 1)  )
                        || ( descendingOrder == true && (ints.get(nextNumber) > ints.get(nextNumber - 1)  ) )
                ) {     isNaturalOrder = false;
                    break; }
            }


        }

        System.out.println(isNaturalOrder);

    }

}