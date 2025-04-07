// Brute force // it will not work as they say in place
class Solution {
    public int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int ans [][] = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n;j++){
                ans[j][n-i-1] = matrix[i][j];
            }
        }
        return ans;
    }
}
//TC: O(n^2) 
// SC: O(n^2) used extra space

// ================== // Optimal // ==================== //
// TC: O(n^2)
//SC: O(1)
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // step 1 : transpose the matrix
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                //swap
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //step 2: reverse the matrix rows
        for(int i = 0; i<n; i++){
            int left = 0;
            int right = n-1;

            while(left<right){
                // swap row using left right pointer
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] =temp;
                left++;
                right--;
            }
        }
    }
}
