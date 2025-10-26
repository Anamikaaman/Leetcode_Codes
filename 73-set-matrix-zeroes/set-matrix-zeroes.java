class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;        // number of rows
        int cols = matrix[0].length;     // number of columns

        // Step 1: Make two arrays to mark which row and column has 0
        int[] rowMark = new int[rows];
        int[] colMark = new int[cols];

        // Step 2: Find all 0s and mark their row & column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowMark[i] = 1;      // mark this row
                    colMark[j] = 1;      // mark this column
                }
            }
        }

        // Step 3: Set matrix cells to 0 where row or column is marked
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowMark[i] == 1 || colMark[j] == 1) {
                    matrix[i][j] = 0;    // set this cell to 0
                }
            }
        }
    }
}