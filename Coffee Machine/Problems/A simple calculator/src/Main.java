import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputs[] = new String[3];

        for (int i = 0 ; i < 3 ; i++) {
            inputs[i] = s.next();
        }
        String caSe = inputs[1];

        switch (caSe) {
            case "+":
                System.out.println(Long.valueOf(inputs[0]) + Long.valueOf(inputs[2]));
                break;
            case "-":
                System.out.println(Long.valueOf(inputs[0]) - Long.valueOf(inputs[2]));
                break;
            case "/":
                if (Long.valueOf(inputs[2]) == 0 ) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(Long.valueOf(inputs[0]) / Long.valueOf(inputs[2]));
                }
                break;
            case "*":
                System.out.println(Long.valueOf(inputs[0]) * Long.valueOf(inputs[2]));
                break;
            default:
                System.out.println("Unknown operator");

        }
    }
}
