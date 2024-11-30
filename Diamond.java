public class Diamond{
    public static void main(String args[]){
        int rows = 5;
        for(int line =1; line <= rows; line++){
            for(int space = 1; space<=5-line; space++){
                System.out.print(" ");
            }
            for(int st = 1; st<=line; st++){
                System.out.print("*");
            }
            for(int stt = 2; stt<=line; stt++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int line = 1; line <rows; line++){
            for(int sp = 1; sp<=line; sp++){
                System.out.print(' ');
            }
            for(int st = 1; st <=5-line; st++){
                System.out.print("*");
            }
            for(int stt = 1; stt<=4-line; stt++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}