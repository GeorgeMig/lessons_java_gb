package lesson_1;

import java.util.Arrays;

class SecondTask {
    public static void main(String[] args) {
       int[] num = {3,2,2,3};
       int vl = 3;
       System.out.println(Arrays.toString(removeElement(num, vl)));
    }
    public static int[] removeElement(int[] nums, int val) {
        char s = '_';
        int k = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val && nums[j] == val) {
                j--;
            } else if (nums[i] == val && nums[j] != val) {
                nums[i] = nums[j];
                nums[j] = val;
                i++;
                k++;
            } else if (nums[i] != val) {
                k++;
                i++;
            }
        }
        return nums; // вместо к сделал возвращение массива, чтобы нагляднее было
    }
}