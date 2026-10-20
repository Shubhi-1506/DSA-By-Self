import java.util.Scanner;
class pattern18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
         for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + (n - 1 - i));

            for (char c = ch; c <= (char) ('A' + n - 1); c++) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}