package First;

public class CalcImpl implements Calculator{

    @Override
    public void add(Integer a, Integer b) {
        System.out.println("a + b = " + (a + b));
    }

    @Override
    public void sub(Integer a, Integer b) {
        System.out.println("a - b = " + (a - b));
    }

    @Override
    public void mult(Integer a, Integer b) {
        System.out.println("a * b = " + (a * b));
    }

    @Override
    public void div(Integer a, Integer b) {
        try {
            System.out.println("a / b = " + (a / b));
        } catch (Exception e) {
            System.out.println("На ноль делить нельзя!");
        }
    }
    
}
