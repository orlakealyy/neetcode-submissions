class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        java.util.Arrays.sort(string1);
        java.util.Arrays.sort(string2);

        return java.util.Arrays.equals(string1, string2);
    }
}
