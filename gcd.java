import java.util.Scanner;
class gcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
while(a!=0){
    int t=a;
    a=b%a;
    b=t;
}
System.out.println("The GCD of the given numbers is: " + b);
    }
}