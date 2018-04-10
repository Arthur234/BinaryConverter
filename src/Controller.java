public class Controller {

    public String demToBinaryString(int a){
        String temp = "";
        int b;
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        return temp;
    }
}

