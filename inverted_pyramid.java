public class inverted_pyramid {
    public static void main(String args[]){
        int rows = 5;
        int col = 5;
        for(int line = 1; line <=rows; line++){
            for(int spaces = 1; spaces <= rows-line; spaces++){
                System.out.print(" ");
            }
            for(int print = 1; print <=line; print++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
