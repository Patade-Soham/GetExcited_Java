import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapping;

        for (int i = 0; i < n - 1; i++) {
            swapping = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    swapping = true;

                }
            }

            if (!swapping) {

                break;
            }
        }
    }

    public static void main(String[] args) {
        int[]array={4,2,2,3,65,8,9,4,24,6,6,3,52,};
        System.out.println("Unsorted array : "+Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Sorted array : "+Arrays.toString(array));
    }
}
