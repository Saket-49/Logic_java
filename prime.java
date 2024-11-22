public class prime {
    public static void main(String args[]){
        int num = 9;
        int i = 2 ;
        boolean prime = true;
        for(; i<=num-1; i++){
            if(num % i == 0){
                prime= false;
            }
        }
        if(prime){
            System.out.println(i + " Prime");
        }
        else{
            System.out.println(i + " composite");
        }
    }
}
