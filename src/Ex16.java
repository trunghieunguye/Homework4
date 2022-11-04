import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        int n = input();
        numbers(n);
    }

    public static int input() {
        System.out.print("Enter n = ");
        return new Scanner(System.in).nextInt();
    }

    public static void numbers(int n){
        String odd = "";
        String even = "";
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                even += "," + i;
                continue;
            }
            odd += "," + i;
        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
}

