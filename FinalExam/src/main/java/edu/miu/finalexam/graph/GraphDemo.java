package edu.miu.finalexam.graph;


public class GraphDemo {

    public static void main(String[] args) {
        int[][] A = {
                {0, 1, 0, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 0, 1, 1},
                {0, 0, 1, 0, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 0, 1, 1},
                {1, 1, 1, 0, 0, 1, 0, 0},
                {0, 0, 1, 1, 1, 1, 0, 0}
        };

        int[][] B = {
                {0, 1, 0, 1, 0, 0},
                {1, 0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0, 0},
                {1, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 0},

        };

        Graph g = new Graph(A);
        System.out.print("DSF: ");
        g.DFS(0);
        System.out.print("\nBFS: ");
        g.BSF(0);
        System.out.println();
        Graph g1 = new Graph(B);
        System.out.print("DFS Components: ");
        g1.getDFSComponents();

        Graph g2 = new Graph(B);
        System.out.print("BSF Components: ");
        g2.getBFSComponents();
    }
}
