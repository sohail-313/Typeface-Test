// The problem is based on the concept of Dfs Or Bfs traversal
// 1. Reading the input of 0's & 1's 
// 2. image is a function which take 2d array as input and return no.of white patches

public int image(int[][] matrix) {
    int white_patches=0;
    for(int i=0;i<matrix.length;i++)
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]=='1'){
                white_area(matrix,i,j);
                white_patches++;
            }
        }
    return white_patches;
}
private void white_area(int[][] matrix,int i, int j){
    if((i>=0 && j>=0) && (i<matrix.length && j<matrix[0].length) && matrix[i][j]=='1'){
        matrix[i][j]='0';
        white_area(matrix, i + 1, j);
        white_area(matrix, i - 1, j);
        white_area(matrix, i, j + 1);
        white_area(matrix, i, j - 1);
    }
}