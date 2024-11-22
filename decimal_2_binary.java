public class decimal_2_binary {
    public static void main(String args[]){
        int dec = 13;
        int bin = 0;
        int p =0;
        while(dec > 0){
            int rem = dec%2;
            bin = rem + (rem * (int) Math.pow(10,p));
            dec = dec/2;
            p++;
        }
        System.out.println(bin);
    }
}
