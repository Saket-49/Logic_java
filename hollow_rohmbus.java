public class hollow_rohmbus {
    public static void main(String args[]){
        int rows = 5;
        for(int line =1; line<=rows; line++ ){
            for(int spaces = 1; spaces<=line; spaces++){
                System.out.print(" ");
            }
            for(int stars = 1; stars <=rows; stars++){
                if(line == 1 || line == rows || stars == 1 || stars == rows ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        
    }
}
