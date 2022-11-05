import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên thỏa mãn:");
        for (int i = 1000000; i <1000000000 ; i++) {
            if (thuanNghich(i)&chuSo068(i)&tongChuSochia10(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean thuanNghich(int n) {
        int m = n;
        int check = 0;
        while (m > 0) {
            check = check * 10 + m % 10;
            m /= 10;
        }
        if (check == n) {
            return true;
        }
        return false;
    }
    public static boolean chuSo068(int n) {
        while (n > 0) {
            switch (n % 10) {
                case 0:
                    break;
                case 6:
                    break;
                case 8:
                    break;
                default:
                    return false;
            }
            n /= 10;
        }
        return true;
    }
    public static boolean tongChuSochia10(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }
}

