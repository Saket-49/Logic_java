public class reverse_right_py {
    public static void main(String args[]){
        int rows = 5;
        for(int line = rows; line >=0 ; line--){
            for(int print = 1; print <= line; print++){
                System.out.print("*");
                if(print == 0){
                    break;
                }
            }
            System.out.println();
        }
    }
}

//correct logic


//print++

