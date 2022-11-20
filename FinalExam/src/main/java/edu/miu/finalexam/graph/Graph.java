package edu.miu.finalexam.graph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Graph {

    private int[][] A;

    private int count = 0;

    public Graph(int[][] A) {
        this.A = A;
    }

    public void getComponents() {
        int len = A.length;
        boolean[] visited = new boolean[len];
        int[] components = new int[len];
        for(int i = 0; i < len; i++) {
            DFSComponents(i, components, visited);
        }
        System.out.println(Arrays.toString(components));
    }

    private void DFSComponents(int source, int[] components, boolean[] visited) {
        if(!visited[source]) {
            count++;
            int len = A.length;
            Stack<Integer> stack = new Stack<>();
            stack.push(source);
            visited[source] = true;
            components[source] = count;
            while(!stack.isEmpty()) {
                int v = stack.peek();
                boolean hasUnvisitedAdjacent = false;
                for(int i = 0; i < len; i++) {
                    if(A[v][i] == 1 && !visited[i]) {
                        hasUnvisitedAdjacent = true;
                        visited[i] = true;
                        components[i] = count;
                        stack.push(i);
                        break;
                    }
                }
                if(!hasUnvisitedAdjacent) {
                    stack.pop();
                }
            }
        }
    }

    public void BSF(int source) {
        int len = A.length;
        boolean[] visited = new boolean[len];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        visited[source] = true;
        System.out.print(source + " ");
        while(!queue.isEmpty()) {
            int v = queue.remove();
            for(int i = 0; i < len; i++) {
                if(A[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public void DFS(int source) {
        int len = A.length;
        boolean[] visited = new boolean[len];
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        visited[source] = true;
        System.out.print(source + " ");
        while(!stack.isEmpty()) {
            int v = stack.peek();
            boolean hasUnvisitedAdjacent = false;
            for(int i = 0; i < len; i++) {
                if(A[v][i] == 1 && !visited[i]) {
                    hasUnvisitedAdjacent = true;
                    System.out.print(i + " ");
                    visited[i] = true;
                    stack.push(i);
                    break;
                }
            }
            if(!hasUnvisitedAdjacent) {
                stack.pop();
            }
        }
    }
}
