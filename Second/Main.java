package Second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку a: ");

        String a = reader.readLine();

        System.out.println("Введите строку b: ");

        String b = reader.readLine();

        System.out.println(a.equals(b) ? "Строки идентичны" : "Строки неидентичны");
    }
}
