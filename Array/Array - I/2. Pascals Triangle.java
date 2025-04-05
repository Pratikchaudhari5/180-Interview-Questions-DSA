class Solution {
    // function : calculate ncr
    public static int nCr(int n, int r)
{
    long res = 1;
    for(int i = 0; i<r; i++){
        res = res*(n-i);
        res = res/(i+1);
    }
    return (int) res;
}    public List<List<Integer>> generate(int numRows) {

    List<List<Integer>> ans = new ArrayList<>();

        for(int row = 0; row<numRows; row++){
            List<Integer> temp = new ArrayList<>();
            for(int col = 0; col<= row; col++){
                temp.add(nCr(row, col));
            }
            ans.add(temp);
        }
        return ans;
        
    }
}
