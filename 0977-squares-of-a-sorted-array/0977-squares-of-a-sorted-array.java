class Solution {
    public int[] sortedSquares(int[] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}