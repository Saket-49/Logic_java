public class butterfly {
    public static void main(String args[]){
        int rows = 5;
        for(int line =1; line <= rows; line++){
            for(int st = 1; st<=line; st++){
                System.out.print("* ");
            }
            for(int sp = 1; sp<=rows-line+1; sp++){
                System.out.print("  ");
            }
            for(int spp = 1; spp<=rows-line; spp++){
                System.out.print("  ");
            }
            for(int stt = 1; stt<=line; stt++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("* * * * * * * * * * * ");
        System.out.println();
        for(int line = 1; line <=rows; line++){
            for(int stt = 1; stt<=rows-line+1; stt++){
                System.out.print("* ");
            }
            for(int spp = 1; spp<=line; spp++){
                System.out.print("  ");
            }
            for(int sp = 2; sp<=line; sp++){
                System.out.print("  ");
            }
            for(int st = 1; st<=rows-line+1; st++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
