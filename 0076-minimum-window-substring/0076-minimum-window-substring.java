import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> targetCounts = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            targetCounts.put(c, targetCounts.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowCounts = new HashMap<>();
        int formed = 0;
        int required = targetCounts.size();

        int minLength = Integer.MAX_VALUE;
        int bestLeft = 0;

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            windowCounts.put(rightChar, windowCounts.getOrDefault(rightChar, 0) + 1);

            if (targetCounts.containsKey(rightChar) && 
                windowCounts.get(rightChar).equals(targetCounts.get(rightChar))) {
                formed++;
            }

            while (left <= right && formed == required) {
                char leftChar = s.charAt(left);

                int currentWindowLen = right - left + 1;
                if (currentWindowLen < minLength) {
                    minLength = currentWindowLen;
                    bestLeft = left;
                }

                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                if (targetCounts.containsKey(leftChar) && 
                    windowCounts.get(leftChar) < targetCounts.get(leftChar)) {
                    formed--;
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(bestLeft, bestLeft + minLength);
    }
}
