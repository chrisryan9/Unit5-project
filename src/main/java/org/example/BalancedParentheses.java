package org.example;

public class BalancedParentheses {
    public static boolean parenthesesCheck(String s) {
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                diff++;
            } else if (s.charAt(i) == ')') {
                diff--;
            }
            if (diff < 0) {
                return false;
            }
        }
        return diff == 0;
    }

    public static void main(String[] args) {
        String s1 = "(())";
        String s2 = "()(()";
        String s3 = "()()()";
        String s4 = "))((";
        System.out.println(s1 + " balanced: " + parenthesesCheck(s1));
        System.out.println(s2 + " balanced: " + parenthesesCheck(s2));
        System.out.println(s3 + " balanced: " + parenthesesCheck(s3));
        System.out.println(s4 + " balanced: " + parenthesesCheck(s4));
    }
}

