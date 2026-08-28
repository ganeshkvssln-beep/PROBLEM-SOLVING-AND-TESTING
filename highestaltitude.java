class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;
        for (int x : gain) {
            altitude += x;
            max = Math.max(max, altitude);
        }
        return max;
    }
}
