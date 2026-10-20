import java.util.Scanner;
class pattern16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        char c;
        for(int i=1;i<=n;i++){
        c=(char)('A'+i-1);
            for(int j=1;j<=i;j++){
                System.out.print(c);
            }
            System.out.println();
        }

 }}
