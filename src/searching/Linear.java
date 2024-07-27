package searching;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the key element to be search:");
        int target = sc.nextInt();
        int result = linearSearch(nums,target);

        if(result != -1){
            System.out.println("Element found at indes:"+result);
        }
        else{
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i = 0;i < nums.length;i++){
            steps++;
            if(nums[i] == target){
                System.out.println("Steps taken by linear :"+steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear :"+steps);
        return -1;
    }
}