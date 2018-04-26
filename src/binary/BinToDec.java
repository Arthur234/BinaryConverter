package binary;

import static java.lang.Math.pow;

public class BinToDec {

    public int binToDec(int[] number){
        int result = 0;
        for(int i = 0; i < number.length; i++){
            result = result + number[number.length - i - 1] * (int)pow(2,i);
        }
        return result;
    }
}
