public class upArrow {
    public static void main(String args[]){
        int rows = 5;
        for(int line =1; line <=rows; line++){
            for(int space = 1; space <=6-line; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <=line; star++){
                System.out.print("*");
            }
            for(int st = 1; st <line ; st++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l = 1; l<= rows ; l++){
            for(int spp = 1; spp<=3; spp++){
                System.out.print(" ");
            }
            for(int st =1; st <= 4; st++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
 