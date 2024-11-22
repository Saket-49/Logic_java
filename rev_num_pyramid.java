public class rev_num_pyramid {
    public static void main(String args[]){
        int row = 5;
        for(int line = 1; line <=row; line++){
            for(int print = 1; print<= 5-line; print++){
                System.out.print(print);
            }
            System.out.println();
        }
    }
}
