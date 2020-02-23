package Algorithms;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
      int n = arr.length;
      int d = 2;

      // in case the rotating factor is
      // greater than array length
      d = d % n;
      leftRotate(arr, d);
      Arrays.stream(arr).forEach(System.out::print);
  }

    private static void leftRotate(int[] arr, int d) {
        if (d == 0)
            return;
        int n = arr.length;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
