package First;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число a: ");

        Integer a = Integer.parseInt(reader.readLine());

        System.out.println("Введите число b: ");

        Integer b = Integer.parseInt(reader.readLine());

        if (a > b) System.out.println("a > b");
        else if (a < b) System.out.println("a < b");
        else System.out.println("a = b");

        Calculator calculator = new CalcImpl();

        calculator.add(a, b);
        calculator.sub(a, b);
        calculator.mult(a, b);
        calculator.div(a, b);

    }
}