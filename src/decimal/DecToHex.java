package decimal;

import java.util.ArrayList;

/**
 * Created by Arthur on 20.04.2018.
 */
public class DecToHex {

    public ArrayList<Integer> decToHex(int number){

        DecToBin d = new DecToBin();
        ArrayList<Integer> result = new ArrayList<Integer>(d.posDemToBinaryString(number));

        if (result.size() % 4 == 0){

        }
        return result;
    }
}
