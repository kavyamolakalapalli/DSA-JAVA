package sorting;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        System.out.println("Array after sorting:");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int[] arr,int l,int mid,int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int x = 0;x<n1;x++){
            lArr[x] = arr[l+x];
        }
        for(int x = 0;x<n2;x++){
            rArr[x] = arr[x+mid+1];
        }
        int i =0;
        int j = 0;
        int k = l;

        while (i<n1 && j<n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }
            else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }
    public static void mergeSort(int[] arr,int l,int r){

        if(l<r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
}
