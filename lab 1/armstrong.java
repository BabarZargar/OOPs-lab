public class armstrong {
    public static void main(String[] args){

        outer:
        for(int n = 100; n<=999; n++){

            int original = n;
            int temp = n;
            int sum = 0;

            while(temp>0){
                int digit = temp % 10;
                sum = sum + digit * digit * digit;
                temp = temp / 10;
            }
            
            if (sum == original) {
                System.out.println("First Armstrong number: " + original);
                break outer;
            }
        }

    }
}
