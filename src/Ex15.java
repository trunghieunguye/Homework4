import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        int n = input();
        int sum = cal(n);
        System.out.println("Sum = "+sum);
    }
    public static int input() {
        System.out.print("Enter n = ");
        return new Scanner(System.in).nextInt();
    }
    public static int cal(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i%7==0){
                sum+=i;
            }
        }
        return sum;
    }
}

