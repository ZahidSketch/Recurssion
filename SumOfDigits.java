import java.util.Scanner;
public class SumOfDigits {

    public static int sod(int n){
        if(n>=0  && n <= 9)
            return n;
        else
            return n % 10 + sod(n / 10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

       System.out.println(sod(n));
    }
}
