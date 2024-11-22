public class binary_2_decimal {
    public static void main(String args[]){
        int num = 1011; 
        int bin = 0;
        int pow = 0;
        while(num >0){
            int ld = num %10;
            bin = bin + ld* (int) Math.pow(2, pow);
            pow ++;
            num /= 10;
        }
        System.out.println(bin);
    }
}
