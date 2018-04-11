public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();

        System.out.println(c.posDemToBinaryString(14));
        System.out.println(c.negDemToBinaryString(-7));

        System.out.println(Integer.toBinaryString(14));
        System.out.println(Integer.toBinaryString(-7));
    }
}
