import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sumOfPerfectSquares = findSumOfPerfectSquares(arr);
        System.out.println(sumOfPerfectSquares);
    }
    public static int findSumOfPerfectSquares(int[] arr) 
    {
        int sum = 0;
        for (int num : arr) {
            if (isPerfectSquare(num))
            {
                sum += num;
            }
        }
        return sum;
    }
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
