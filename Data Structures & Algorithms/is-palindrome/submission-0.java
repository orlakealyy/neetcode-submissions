class Solution {
    public boolean isPalindrome(String s) {
        String sReversed = "";
        String sCleaned = "";

        for (int i = s.length() - 1; i > -1; i--) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sReversed = sReversed + s.charAt(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sCleaned = sCleaned + s.charAt(i);
            }
        }

        sReversed = sReversed.toLowerCase();
        System.out.println(sReversed);
        sCleaned = sCleaned.toLowerCase();
        System.out.println(sCleaned);

        if (sCleaned.equals(sReversed)) {
            return true;
        }

        return false;
    }
}

