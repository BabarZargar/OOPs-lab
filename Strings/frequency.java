import java.util.Scanner;

public class frequency {
    static void printFrequency(String str){
        for(int i = 0; i <str.length(); i++){
            char ch = str.charAt(i);
            boolean seen = false;

            // dekho agar pehle aaya hai
            for(int j = 0; j <  i; j++){
                if(str.charAt(j) == ch){
                    seen = true;
                    break;
                }
            }

            if(seen){
                continue;
            }
            int count = 0;
            for(int j = i; j<str.length(); j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            
            System.out.println(ch + " : " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string: ");
        String str = sc.nextLine();

        printFrequency(str);

        sc.close();
    }
}
