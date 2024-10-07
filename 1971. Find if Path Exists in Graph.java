
class Solution {             
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++)
			graph.add(new ArrayList<Integer>());    
		for(int i=0;i<edges.length;i++) {
			graph.get(edges[i][0]).add(edges[i][1]);
			graph.get(edges[i][1]).add(edges[i][0]);
        
		}
        return isValid(graph,source,destination,vis);
    }
    public boolean isValid(List<List<Integer>> graph,int src,int dest,boolean[] vis) {
		if(src==dest) {
            return true;
        }
		vis[src]=true;
		for(int e:graph.get(src)) {
			if(!vis[e] && isValid(graph,e,dest,vis)) 
				return true;
		}
		return false;
	}
}