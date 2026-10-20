import java.util.Scanner;
class pattern11{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int n = sc.nextInt();
    int k;
    for(int i=1;i<=n;i++){
         if(i%2==0){
          k=0;
         }
         else{
            k=1;
          
         }
         for(int j=1;j<=i;j++){
        
            System.out.print(k);
            if(k==0){
                k=1;
            }
            else{
                k=0;
            }
         }
         System.out.println();
    }
}}