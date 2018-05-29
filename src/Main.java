import logic.Decimal;

public class Main{

    public static void main(String[] args) {

        int[] t = new int[] {1, 1, 0, 1, 1, 1, 1};

        Decimal d = new Decimal();
        d.calculate(160, 10);

        d.calculate(t, 2);
    }
}
