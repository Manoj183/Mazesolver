package org.example;

import java.util.ArrayList;

public class DepthFirst {
    public static boolean searchPath(int[][] maze, int x, int y, ArrayList<Integer> path) {
        if (maze[y][x] == 9) {
            path.add(x);
            path.add(y);
            return true;
        }
        if (maze[y][x] == 0) {
            maze[y][x] = 2;
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};
            for (int k = 0; k < 4; k++) {
                if (searchPath(maze, x + dx[k], y + dy[k], path)) {
                    path.add(x);
                    path.add(y);
                    return true;
                }
            }
        }
        return false;
    }
}
