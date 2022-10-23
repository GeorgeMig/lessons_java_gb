package lesson_1;

class ThirdTask {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder("");
        int end = s.length() - 1;

        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end -= 1;
                continue;
            }
            int start = end - 1;

            while (start >= 0 && s.charAt(start) != ' ') {
                start -= 1;
            }
            res.append(" ");
            res.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }

        if (res.length() > 0) {
            res.deleteCharAt(0);
        }
        return res.toString();
    }
}
