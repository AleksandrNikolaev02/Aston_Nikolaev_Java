package Third;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int elem : array) {
            if (elem % 2 == 0) System.out.println(elem);
        }
    }
}
