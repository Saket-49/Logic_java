public class hollow_rect {
    public static void main(String args[]){
        int row = 5;
        int col = 5;
        for(int line=1; line <=row; line++){
            for(int star = 1; star <=line; star++){
                if(line==1 || line == row || star==col || star == 1){
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


//Dry run :
// outer loop for line
//inner loop for printing
