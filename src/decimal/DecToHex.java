package decimal;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DecToHex {

    public ArrayList<String> decToHex(double fraction){

        ArrayList<String> result = new ArrayList<String>();
        BigDecimal bd;
        BigDecimal b;

        while (fraction != 0){
            while (fraction > 16) {
                fraction = (fraction / 16);
            }

            int temp = (int)fraction;

            bd = new BigDecimal(fraction);
            b = bd.remainder(BigDecimal.ONE);
            fraction = Double.parseDouble(String.valueOf(b)) * 16;

            result = values(temp, result);
        }
        return result;
    }

    private ArrayList<String> values(int number, ArrayList<String> result){
        switch (number){
            case 1:
                result.add("1");
                break;
            case 2:
                result.add("2");
                break;
            case 3:
                result.add("3");
                break;
            case 4:
                result.add("4");
                break;
            case 5:
                result.add("5");
                break;
            case 6:
                result.add("6");
                break;
            case 7:
                result.add("7");
                break;
            case 8:
                result.add("8");
                break;
            case 9:
                result.add("9");
                break;
            case 10:
                result.add("A");
                break;
            case 11:
                result.add("B");
                break;
            case 12:
                result.add("C");
                break;
            case 13:
                result.add("D");
                break;
            case 14:
                result.add("E");
                break;
            case 15:
                result.add("F");
                break;
        }
        return result;
    }
}
