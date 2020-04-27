class Solution {
    public int numIslands(char[][] grid) {
        int island = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1'){
                island++;
                flood(i,j,'1',grid,'0');
            }
        }
        }
        
        return island;
    }
    public void flood(int startX, int startY, char searchPart, char[][] arr,char color){
        if((startX < arr.length && startX > -1)&&(startY < arr[0].length && startY > -1) && arr[startX][startY]== searchPart){
            
            arr[startX][startY] = color;
            flood(startX+1,startY,searchPart,arr,color);
            flood(startX,startY+1,searchPart,arr,color);
            flood(startX-1,startY,searchPart,arr,color);
            flood(startX,startY-1,searchPart,arr,color);
        }else{
            return;
        }

    }
}
