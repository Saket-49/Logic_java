public class rev_num {
    public static void main(String args[]){
        int num = 234;
        while(num >0){
            int ld = num%10;
            System.out.print(ld);
            num /= 10;
        }
    }
}
