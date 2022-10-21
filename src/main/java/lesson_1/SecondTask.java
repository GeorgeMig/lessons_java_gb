package lesson_1;

class SecondTask {
    public int removeElement(int[] nums, int val) {
        char s = '_';
        int k = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j){
            if (nums [i] == val && nums [j] == val){
                j--;
            }
            else if (nums [i] == val && nums [j] != val){
                nums [i] = nums [j];
                nums [j] = val;
                i++;
                k++;
            }
            else if (nums [i] != val){
                k++;
                i++;
            }
        }
        return k;
    }
}