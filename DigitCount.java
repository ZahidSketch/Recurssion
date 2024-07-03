import java.util.Scanner;
public class DigitCount {
    static int count = 0;
    public static int digitCount(int n) {
        if (n == 0)
            return 1;
        else{
            count++;
            digitCount(n / 10);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(digitCount(n));
    }
}
