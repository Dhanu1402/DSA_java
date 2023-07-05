class Solution {
    public int[] shuffle(int[] nums, int n) {
        int shufle[] = new int[n * 2];
        for (int i = 0; i < n; i++){
            shufle[i * 2] = nums[i];
            shufle[i * 2 + 1] = nums[i + n];
        }
        return shufle;
    }
}
