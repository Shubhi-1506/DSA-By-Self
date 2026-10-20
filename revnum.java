import java.util.Scanner;
class revnum{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
        int n = sc.nextInt();
        int rev = 0;
        int original = n;
        if(n<0){
            n = -n;
        }
        while(n!=0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        if(original<0){
            rev = -rev;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}