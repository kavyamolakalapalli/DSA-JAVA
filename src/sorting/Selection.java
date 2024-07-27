package sorting;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        SelectionSort(arr,n);
        System.out.println("Array after sorting:");
        for (int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void SelectionSort(int[] arr,int n){
        int minIndex;
        for(int i = 0;i<n-1;i++){
            minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }
}
