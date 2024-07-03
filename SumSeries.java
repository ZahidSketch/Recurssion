public class SumSeries {

    public static int sumSeries(int n) {
        if(n == 0) return 0;
        if(n % 2 ==0)
            return sumSeries (n - 1) - n ;
        else
            return sumSeries (n - 1) + n ;
    }
    public static void main(String[] args){
        System.out.println(sumSeries(5));
    }
}
