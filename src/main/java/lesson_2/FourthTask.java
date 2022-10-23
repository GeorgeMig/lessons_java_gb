package lesson_2;

class FourthTask {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
    static int [] steps;

    public static int climbStairs(int n) {
        steps = new int[n + 1];
        steps[0] = 1;
        steps[1] = 1;

        getSteps(n);
        return steps[n];
    }
    private static int getSteps(int n){
        if (steps[n] != 0){
            return steps[n];
        }
        steps [n] = getSteps(n - 1) + getSteps(n - 2);
        return steps[n];
    }
}
