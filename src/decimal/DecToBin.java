package decimal;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Arthur on 13.04.2018.
 */
public class DecToBin {
    public ArrayList<Integer> posDemToBinaryString(int number){
        ArrayList<Integer> count = new ArrayList<Integer>();
        while (number != 0) {
            int temp = number % 2;
            count.add(temp);
            number = number / 2;
        }
        Collections.reverse(count);
        return count;
    }

    public ArrayList<Integer> negDemToBinaryString(int number){
        ArrayList<Integer> count = new ArrayList<Integer>();
        number = -number;

        while(number != 0){
            int temp = number %2;
            count.add((temp == 0) ? 1 : 0);
            number = number /2;
        }
        Collections.reverse(count);
        count = addUnit(count, count.size() -1);
        return count;
    }

    public ArrayList<Integer> addUnit(ArrayList<Integer> arrayList, int i) {
        if (arrayList.get(i) == 1) {
            arrayList.set(i, 0);
            Unit(arrayList, i);

        } else if (arrayList.get(i) == 0) {
            arrayList.set(i, 1);
        }

        return arrayList;
    }

    private ArrayList<Integer> Unit(ArrayList<Integer> arrayList, int i){
        if(arrayList.get(i - 1) == 1) {
            arrayList.set(i - 1, 1);
        }
        return addUnit(arrayList, i - 1);
    }
}
