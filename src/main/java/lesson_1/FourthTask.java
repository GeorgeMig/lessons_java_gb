package lesson_1;

class FourthTask {
    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));
    }
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        boolean p = true;
        while (start <= end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start += 1;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end -= 1;
            }

            char startCh = Character.toLowerCase(s.charAt(start));
            char endCh = Character.toLowerCase(s.charAt(end));
            if (startCh != endCh) p = false;
            start += 1;
            end -= 1;

        }
        return p;
    }
}