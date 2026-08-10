import java.util.Scanner;
public class NumberAnalyzer {


    void analyze(int n) {
        boolean prime = true;

        if (n<2) 
            prime = false;

        for (int i = 2; i<n; i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }

        if (prime){
            System.out.println(n + " is prime");
        }
        else{
            System.out.println(n + " is not prime");
        }
    }

    void analyze(int a, int b){
        if(a>b){
            System.out.println(a + " is largest");
        }
        else{
            System.out.println(b + " is largest");
        }
    }

    void analyze(int x, int y, int z){
        if(x<y){
            if(x<z){
                System.out.println(x + " is smallest");
            }
            else{
                System.out.println(z + " is smallest");
            }
        }
        else{
            if(y<z){
                System.out.println(y + " is smallest");
            }
            else{
                System.out.println(z + " is smallest");
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NumberAnalyzer obj = new NumberAnalyzer();
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        obj.analyze(n);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.analyze(a, b);

        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        obj.analyze(x, y, z);

        sc.close();
    }
    
}
