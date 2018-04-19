package binary;

import java.util.ArrayList;

import static java.lang.Math.pow;

/**
 * Created by Arthur on 20.04.2018.
 */
public class BinToDec {

    public int binToDec(int[] number){
        int result = 0;
        for(int i = 0; i < number.length; i++){
            result = result + number[number.length - i - 1] * (int)pow(2,i);
        }
        return result;
    }
}
