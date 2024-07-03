import java.util.Scanner;

public class printDecreasing {
    public static void printIncreasing(int n) {
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printIncreasing(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        printIncreasing(n);
    }
}

