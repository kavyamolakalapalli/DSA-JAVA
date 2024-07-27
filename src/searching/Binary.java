package searching;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target value to be search:");
        int target = sc.nextInt();

        int result = BinarySearchRecursive(nums,target,0,nums.length-1);

        if(result != -1){
            System.out.println("Element found at indes:"+result);
        }
        else{
            System.out.println("Element not found");
        }


    }

    private static int BinarySearchRecursive(int[] nums, int target,int left,int right) {
        if(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                return BinarySearchRecursive(nums,target,mid+1,right);
            }
            else{
                return BinarySearchRecursive(nums,target,left,mid-1);
            }
        }
       return -1;
    }

}