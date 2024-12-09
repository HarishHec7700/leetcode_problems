
// By Adjacent List method 

// Vertice      Neighbours
// 0        ->  1,2
// 1        ->  2,0
// 2        ->  0,1


class Main{
    public static boolean dfs(Map<Integer, List<Integer>> graph , int source , int dest , int n , boolean[] visited){
        if(source == dest){
            return true;
        }
        visited[source] = true; 
        for(int neighbour : graph.get(source)){
            if(!visited[source]){
                if (dfs(graph , neighbour, dest , n , visited)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(){
        int source= 0, int dest= 2, int n= 3;
        int [][] edges = {{0,1},{1,2},{2,0}};

        // Initializing graph 
        Map<Integer , List<Integer>> graph = new HashMap<>();
        for(int [] edge : edges ){
            int u = edge[0], v= edge[1];
            graph.computeIfAbsent(u , new ArrayList <>() .add(v));
            graph.computeIfAbsent(v, new ArrayList <>() .add(u));
        }

        // Creating Visited array 
        boolean [] visited = new boolean[n];

        System.out.println(dfs(graph, source, dest, n, visited));

    } 
}
