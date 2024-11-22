public class reverse_left_py {
    public static void main(String args[]){
        int rows = 5;
        // int cols =5 ;
        for(int line =0; line <=rows; line++){
            for(int spaces =1; spaces <= line; spaces++){
                System.out.print(" ");
            }
            for(int print =1; print <= 6-line; print++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
