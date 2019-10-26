package backtracking.ratinmaze;

public class RatInMaze {
    boolean isSafe(int[][] maze, int x, int y, int n) {
        if(x<n && y<n && maze[x][y]!=0)
            return true;
        return false;
    }
    boolean solveMaze(int[][] maze, int x, int y, int[][] sol,int n){
        if( x== n-1 && y == n-1) {
            sol[x][y] = 1;
            return true;
        }

        if(isSafe(maze, x, y, n)) {
            sol[x][y] = 1;

            if(solveMaze(maze, x+1, y, sol, n))
                return true;

            if(solveMaze(maze, x, y+1, sol, n))
                return true;

            sol[x][y] = 0;
            return false;
        }
        return false;
    }
    public static void main(String args[]) {
        RatInMaze rat = new RatInMaze();
        int[][] maze={{ 1, 0, 0, 0 },
                      { 1, 1, 0, 1 },
                      { 0, 1, 0, 0 },
                      { 1, 1, 1, 1 } };
        int n = maze.length;
        int[][] sol = new int[n][n];

        if(rat.solveMaze(maze, 0, 0, sol, n)) {
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(sol[i][j]);
                }
                System.out.println();
            }
        }

    }
}
