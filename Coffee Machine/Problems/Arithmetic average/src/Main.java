import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[2];
        List<Integer> divisibleby3 = new ArrayList<>();

        for (int i = 0 ; i< 2 ; i++) {
        inputs[i] = scanner.nextInt();
        }


        for (int i = inputs[0] ; i <= inputs[1] ; i++) {
            if (i%3 ==0)
                divisibleby3.add(i);
        }

        double value = divisibleby3.stream().mapToInt(Integer::intValue).average().orElse(-1);
        System.out.println(value);
    }
}