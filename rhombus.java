public class rhombus {
    public static void main(String args[]){
        int rows = 5;
        for(int line = 1; line <=rows; line++){
            for(int space = 1; space <=line; space++){
                System.out.print(" ");
            }
            for(int print= 1; print<=5; print++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
