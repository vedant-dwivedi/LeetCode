class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] rearrangedArray = new int[nums.length];
        int positiveIndex = 0, negativeIndex = 1;
        for (int num : nums) {
            if (num > 0) {
                rearrangedArray[positiveIndex] = num;
                positiveIndex += 2;
            } else {
                rearrangedArray[negativeIndex] = num;
                negativeIndex += 2; 
            }
        }
        return rearrangedArray;
    }
}
