
public class Ex18 {
    public static void main(String[] args) {
        ReverseNumbers();
    }
    public static void ReverseNumbers() {
        int sum = 0;
        String ReverseNumbs = "";
        for (int i = 100001; i < 1000000; i++) {
            int CompareNumb = 0;
            int temp = i;
            while (i > 0) {
                CompareNumb = 10 * CompareNumb + i % 10;
                sum += i % 10;
                i /= 10;
            }
            if (CompareNumb == temp & sum % 10 == 0) {
                ReverseNumbs += ", " + temp;
            }
            i = temp;
        }
        System.out.println("Reverse numbers: " + ReverseNumbs);
    }
}

