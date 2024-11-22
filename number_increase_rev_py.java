public class number_increase_rev_py {
    public static void main(String args[]){
        int row = 5;
        int num = 1;
        for(int line =1 ; line <= row; line++){
            for(int print = 1; print <= line; print++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
