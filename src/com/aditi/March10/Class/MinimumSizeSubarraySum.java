package com.aditi.March10.Class;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(minimumSize(arr, target));
    }
    public static int minimumSize(int[] arr, int target) {
        int start = 0;
        int sum = 0;
        int miniLength = Integer.MAX_VALUE;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while(sum >= target) {
                miniLength = Math.min(miniLength, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        if(miniLength == Integer.MAX_VALUE)
            return 0;

        return miniLength;
    }
}
