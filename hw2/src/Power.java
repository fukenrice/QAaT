public class Power {

    public int pow(int a, int b) {
        int r = 1;

        while(b > 0) {
            if((b&1) != 0) r *= a;
            r *= r;
            b >>= 1;
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(new Power().pow(4,3));
    }

}
