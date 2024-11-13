class Solution {
    public void setZeroes(int[][] matrix) {
        int n= matrix.length;
        int m=matrix[0].length;

        Set<Integer> rowsToZero = new HashSet<>();
        Set<Integer> colsToZero = new HashSet<>();


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    rowsToZero.add(i);
                    colsToZero.add(j);
                }
                    
            }    
        } 


        for(int row: rowsToZero){
            for(int j=0;j<m;j++){
                matrix[row][j] = 0;
            }
            
        }


        for(int col: colsToZero){
            for(int i=0;i<n;i++){
                matrix[i][col] = 0;
            }
            
        }  
    }
}