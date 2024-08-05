package sorting;

import java.util.Scanner;

public class Quick {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int low = 0, high = n-1;
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        QuickSort(arr,n,low,high);
        System.out.println("Array after sorting:");
        for(int i = 0;i <n;i++){
            System.out.println(arr[i]);
        }

    }

    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low;j<high;j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public static void QuickSort(int[] arr,int n,int low,int high) {

        if (low < high) {
            int p = partition(arr, low, high);
            QuickSort(arr, n, low, p - 1);
            QuickSort(arr, n, p + 1, high);
        }
    }
}

//time complexity : O(nlogn)