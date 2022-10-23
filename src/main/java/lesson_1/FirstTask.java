package lesson_1;

import java.util.Arrays;

class FirstTask {
    public static void main(String[] args) {
        int[] num = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(num)));
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int [nums.length];
        for (int i: nums){
            ans [i] = nums [nums [i]];
        }
        return ans;
    }
}
