class StringComparison {
    public static int compress(char[] chars) {
        int w = 0; 
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            char current = chars[i];
            int count = 1;
            while (i + 1 < n && chars[i] == chars[i + 1]) {
                i++;
                count++;
            }
            chars[w++] = current;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[w++] = c;
                }
            }
        }
        return w; 
    }
}
