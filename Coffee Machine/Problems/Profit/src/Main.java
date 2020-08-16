import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[3];
        for (int i = 0 ; i < 3 ; i++) {
            inputs[i] = scanner.nextInt();
        }

        double MoneyinBank = inputs[0];
        double PercentEveryYear = inputs[1]/100d;
        int KMoneyNeeded = inputs[2];

        int howMannyYears = 0;
        while (MoneyinBank < KMoneyNeeded) {
            howMannyYears++;
            MoneyinBank =
                    MoneyinBank +  (MoneyinBank * PercentEveryYear);

        }
        System.out.println(howMannyYears);


    }
}