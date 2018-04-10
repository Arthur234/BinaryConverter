public class Controller {

    public String demToBinaryString(int a){

        int b;
        StringBuilder sb = new StringBuilder();
        while (a != 0) {
            if(a > 0) {
                b = a%2;
                sb.append(b);
                a = a / 2;
            } else if(a < 0){
                changeSign(a);
                b = a%2;
                sb.append((b == 0) ? 1 : 0);
                a = a/2;
                changeSign(a);
                addOneBinary(sb);
            }
        }
        return String.valueOf(sb.reverse()) + " " + sb.length();
    }

    public int changeSign(int sign){
        return -sign;
    }

    public StringBuilder addOneBinary(StringBuilder sb){
        return sb;
    }
}

