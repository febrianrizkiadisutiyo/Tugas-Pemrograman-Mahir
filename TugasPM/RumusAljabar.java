package TugasPM;
import java.util.Scanner;

public class RumusAljabar {
    public static void main(String[] args) {
        StackFebrian stack = new StackFebrian(20);

        String rumus = "f(x)=(x-3)(x+9)";
        Scanner input = new Scanner(rumus);
        System.out.print("Rumus Aljabar : " +rumus);

        input.useDelimiter("");

        for (int i = 0; i < rumus.length(); i++) {
            String data = input.next();
            if (data.equals("(")) {
                stack.push("(");
            } else if (data.equals(")")) {
                stack.pop();
            }
        }
        if ( stack.isEmpty() ) {
            System.out.println("\nRumus valid");
        } else {
            System.out.println("\nRumus tidak valid");
        }
    }
}
