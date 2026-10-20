import java.util.Scanner;
class pattern7{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j=j+1){
                System.out.print("*");
            }
            System.out.println();
    }
}}