package decimal;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by root on 29.05.18.
 */
public class Dechimal implements Controller{

    @Override
    public void calculate(int number, int system) {
        ArrayList result = new ArrayList();
        int temp;
        char ch = 64; //A - 1
        while(number != 0){
            temp = number % system;

            number = (temp > 0) ? (number - temp)/system : number/system;
            if(temp > 9){
                result.add((char) (ch + temp - 9));
            } else {
                result.add(temp);
            }
        }
        Collections.reverse(result);
        System.out.println(result);
    }
}
