package searching;

import java.util.Scanner;

public class Fibanocci {

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

        int result = FibanacciSearch(nums,target);

        if(result!=-1){
            System.out.println("Key found:" +result);
        }
        else{
            System.out.println("key not found");
        }

    }


    public static int FibanacciSearch(int[] nums,int target){
        int n = nums.length-1;

        int fib1 = 0;
        int fib2 = 1;
        int fib3 = fib1 + fib2;

        while(fib3 < n){
            fib1 = fib2;
            fib2 = fib3;
            fib3 = fib1 + fib2;
        }
        int offset = -1;

        while(fib3 > 1) {
            int i = min(offset+fib1,n-1);

            if(nums[i] < target){
                fib3 = fib2;
                fib2 = fib1;
                fib1 = fib3 - fib2;
                offset = i;
            }

            else if(nums[i] > target){
                fib3 = fib1;
                fib2 = fib2 - fib1;
                fib1 = fib3 - fib2;
            }

            else{
                return i;
            }
        }

        if(fib2 == 1 && nums[offset+1] == target){
            return offset + 1;
        }

        return -1;
    }

    private static int min(int a, int b) {
        return a<b?a:b;
    }
}