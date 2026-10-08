class Solution {
    public boolean isAnagram(String s, String t) {
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        java.util.Arrays.sort(string1);
        java.util.Arrays.sort(string2);

        return java.util.Arrays.equals(string1, string2);
    }
}
