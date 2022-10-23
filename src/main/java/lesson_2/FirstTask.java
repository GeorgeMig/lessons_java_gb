package lesson_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FirstTask {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new List[]{combine(4, 2)}));
    }
    static List<List<Integer>> array;
    public static List<List<Integer>> combine(int n, int k) {
        array = new ArrayList<>();
        getCombo(0, new ArrayList<>(), n, k);
        return array;
    }

    public static void getCombo(int prev, List<Integer> comb, int n, int k){
        if (comb.size() == k){
            array.add(new ArrayList<>(comb));
            return;
        }

        for (int i = prev + 1; i <= n; i++){
            comb.add(i);
            getCombo(i, comb, n, k);
            comb.remove(comb.size() - 1);

        }
    }
}