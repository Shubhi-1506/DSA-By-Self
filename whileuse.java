import java.util.Scanner;
class whileuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a digit(0-9): ");
        n = sc.nextInt();
        int d;
       if(n==0){
         d=10;
       }
       else{
        d=n;
       }
       int c=50;
         int sum=0;
         while(c!=0){
            sum=sum+d;
            d=d+10;
            c--;
         }
         System.out.println("Sum: " + sum);
        }
    }
