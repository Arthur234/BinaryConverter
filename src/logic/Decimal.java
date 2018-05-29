package logic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by root on 29.05.18.
 */
public class Decimal implements Controller{

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

    @Override
    public void calculate(int[] a, int system) {
        int result = 0;

        for(int i = 0; i < a.length; i++){
            result += a[i] * (int)Math.pow(system, i);
        }
        System.out.println(result);
    }
}
