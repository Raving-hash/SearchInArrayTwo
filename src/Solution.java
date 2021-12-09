class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int mLen = matrix[0].length-1;
        int mid;
        for (int[] ints : matrix) {
            int end = mLen;
            int start = 0;
            if( target == ints[start] || target == ints[end]){
                return true;
            }else {
                while (start <= end) {
                    mid = start + (end - start) / 2;
                    if (target == ints[mid]) {
                        return true;
                    } else if (target < ints[mid]) {
                        end = mid - 1;
                    } else if (target > ints[mid]) {
                        start = mid + 1;
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {};
        boolean numberIn2DArray = solution.findNumberIn2DArray(matrix, 0);
        System.out.println("numberIn2DArray = " + numberIn2DArray);
    }
}