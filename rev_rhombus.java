public class rev_rhombus {
    public static void main(String args[]){
        int rows =5;
        for(int line = 1; line <= rows; line++){
            for(int spaces = line; spaces >=0; spaces--){
                System.out.print(" ");
            }
            for(int stars = 1; stars <= rows; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
