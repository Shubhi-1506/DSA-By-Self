import java.util.Scanner;
class countdigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
     if(n<0){
         n = -n;
     }
     int count = 0;
     while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println("The number of digits in the given number is: " + count);
    }
}