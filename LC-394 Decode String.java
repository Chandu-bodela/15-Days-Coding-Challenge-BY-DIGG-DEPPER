import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        String result = "";
        int index = 0;

        while (index < s.length()) {
            char c = s.charAt(index);

            if (Character.isDigit(c)) {
                int num = 0;
                while (index < s.length() && Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(num);
            } else if (c == '[') {
                resultStack.push(result);
                result = "";
                index++;
            } else if (c == ']') {
                String temp = resultStack.pop();
                int count = counts.pop();
                StringBuilder sb = new StringBuilder(temp);
                for (int i = 0; i < count; i++) {
                    sb.append(result);
                }
                result = sb.toString();
                index++;
            } else {
                result += c;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read encoded string
        String encoded = sc.nextLine();

        Solution sol = new Solution();
        String decoded = sol.decodeString(encoded);

        System.out.println(decoded);

        sc.close();
    }
}
