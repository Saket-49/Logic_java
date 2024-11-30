public class side_triangle {
    public static void main(String args[]){
        int rows = 5;
        for(int line =1; line <=rows; line++){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l = 1; l <= rows; l++){
            for(int st = 1; st <=rows-l; st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
