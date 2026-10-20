import java.util.Scanner;
class pattern15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(char j='A';j<='A'+i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}