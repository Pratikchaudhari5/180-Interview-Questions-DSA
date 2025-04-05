// Brute force - using extra space// 
// create two arrays then mark row and col as true if we had zero then at last reiterate and set the marked row col to zero
class Solution {
    public void setZeroes(int[][] matrix) {
        // if an any element is 0 in matrix then set entire row and column to 0.
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] zeroRows = new boolean[n];
        boolean[] zeroCols = new boolean[m];

        //1st pass: Find all the row and columns that need to be zeroed
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m;j++){
                if(matrix[i][j]==0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        //2nd pass : set all elements that marked row and col to zero
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(zeroRows[i] || zeroCols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
// ========================================================================================================= // 
