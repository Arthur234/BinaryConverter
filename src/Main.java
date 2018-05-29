import binary.BinToDec;
import decimal.DecToBin;
import decimal.DecToHex;
import decimal.Dechimal;

public class Main{

    public static void main(String[] args) {

        DecToBin dtb = new DecToBin();
        DecToHex dth = new DecToHex();
        BinToDec btd = new BinToDec();

//        int[] ar = {1, 0, 1, 1};
//        System.out.println(btd.binToDec(ar));

//        System.out.println(dtb.posDemToBinaryString(14));
//        System.out.println(dtb.negDemToBinaryString(-14));

//        System.out.println(dth.decToHex((double)320/16));

        Dechimal d = new Dechimal();

        d.calculate(400, 16);
    }
}
