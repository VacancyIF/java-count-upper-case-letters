package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(countUpperCaseLetters("AaBbCc1234ABC"));
    }

    /**
     * `countUpperCaseLetters()` method returns the number of upper case letters in the given
     * English string.
     *
     * <p>For example, `countUpperCaseLetters("1A2B3C4d")` returns `3`.
     */
    public static int countUpperCaseLetters(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (Pattern.matches("[A-Z]", Character.toString(aChar))) {
                count += 1;
            }
        }
        return count;
    }
}
