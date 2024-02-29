import java.util.Scanner;

class B {
    // Sorts array using bubble sort algorithm
    static void bubbleSort(int[] arr, int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            printArray(arr, n);
            if (!swapped)
                break;
        }
    }

    // Prints array elements
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Input array size
        System.out.println("Enter array size");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        // Input array elements
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        bubbleSort(arr, n);
        System.out.println("Sorted array");
        printArray(arr, n);
    }
}
