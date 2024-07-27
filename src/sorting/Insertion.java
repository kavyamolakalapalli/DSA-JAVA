package sorting;

import java.util.Scanner;

public class Insertion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        InsertionSort(arr,n);
        System.out.println("array sorted:");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void InsertionSort(int[] arr,int n){
        for(int i = 1;i<n;i++){
            int j,k;
            k = arr[i];
            j = i-1;
            while(j>=0 && k<=arr[j]){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = k;
        }

    }
}
