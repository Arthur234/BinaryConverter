public class Controller {

    public String demToBinaryString(int a){

        StringBuilder sb = new StringBuilder();
        while (a != 0) {
            int b = a % 2;
            sb.append(b);
            a = a / 2;
        }
        return String.valueOf(sb.reverse());
    }
}

