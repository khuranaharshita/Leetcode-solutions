public class validPalindrom {
    public boolean isPalindrome(String s) {
        StringBuilder str_new = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str_new.append(Character.toLowerCase(c));
            }
        }
        String str = str_new.toString();
        String reversed = str_new.reverse().toString();
        return str.equals(reversed);
    }
}
