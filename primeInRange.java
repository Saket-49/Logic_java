public class primeInRange {
    public static void main(String args[]){
        int range = 19;// number to be told prime or composite
        for(int i = 1; i<=range; i++){
            boolean prime = true;
            for(int p = 2; p<=i-1; p++){
                if(i%p == 0){
                    prime = false;
                }
            }
            if(prime){
                System.out.println(i + " prime");
            }
            else{
                System.out.println(i + " composite");
            }
        }
    }
}
// what is happening in the code ==

// sabse pehle initialising the range that is 19
// uske baad ek loop chalayenge for finding numbers that are prime or composite
// iss loop mei define karenge hum boolean prime  // just so that yeh prime variable har value of i ke liye reset hota rahe
// and then inner loop jo ki divisor honge int he range of 2 se lekar i-1 tak
