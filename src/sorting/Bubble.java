package sorting;

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr,n);
        System.out.println("after sorting:");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }


    }

    public static void BubbleSort(int[] arr,int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
