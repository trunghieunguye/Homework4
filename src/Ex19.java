import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        int[] arr=arr_input();
        quicksort(arr,0,arr.length-1);
        System.out.println("The largest number in the array is "+arr[arr.length-1]);
        System.out.println("The smallest number in the array is "+arr[0]);
    }

    public static int[] arr_input() {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static void quicksort(int[] arr, int LowIndex,int HighIndex) {
        int pivot = arr[HighIndex];
        int RightPointer = HighIndex;
        int LeftPointer = LowIndex;
        if (LeftPointer >= RightPointer){
            return;
        }
        while (LeftPointer < RightPointer){
            while (arr[LeftPointer] <= pivot & LeftPointer < RightPointer){
                LeftPointer++;
            }
            while (arr[RightPointer] >= pivot & LeftPointer < RightPointer){
                RightPointer--;
            }
            swap(arr, LeftPointer, RightPointer);
        }
        swap(arr,LeftPointer,HighIndex);
        quicksort(arr,LowIndex,LeftPointer-1);
        quicksort(arr,LeftPointer+1,HighIndex);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

