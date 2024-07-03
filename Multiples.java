import java.util.Scanner;

public class Multiples {

    public static void printMultiples(int k, int n) {
        if(n == 1){
            System.out.print(k);
            return;
        }else
            printMultiples(k, n-1);

        System.out.print(" "+n*k);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.print("Enter the number of multiples : ");
        int b = sc.nextInt();

        printMultiples(a,b);
    }
}
