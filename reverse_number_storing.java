public class reverse_number_storing {
    public static void main(String args[]){
        int num = 456;
        int rev = 0;
        while(num >0){
            int ld = num %10;
            rev = rev*10 + ld;
            num /= 10;
        }
        System.out.println(rev);
    }
}
