
import java.util.*;
class primeno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
   int c=0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
            c++;
                if (i != n / i) {
               c++;
                }
            }
        }
        if(c==2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}