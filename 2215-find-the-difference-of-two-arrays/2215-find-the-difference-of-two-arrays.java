class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);
        List<Integer> diff1 = new ArrayList<>(set1);
        diff1.removeAll(set2);
        List<Integer> diff2 = new ArrayList<>(set2);
        diff2.removeAll(set1);
        List<List<Integer>> res = new ArrayList<>();
        res.add(diff1);
        res.add(diff2);
        return res;
    }
}
