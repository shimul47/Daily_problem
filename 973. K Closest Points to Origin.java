class Solution {
    static class pq implements Comparable<pq>{
        int x;
        int y;
        int sq;
        public pq(int x,int y,int sq){
            this.x=x;
            this.y=y;
            this.sq=sq;
        }
        @Override
        public int compareTo(pq p2){
            return this.sq-p2.sq;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<pq> op = new PriorityQueue<>();
        for (int i = 0;i<points.length;i++){
            int sq = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            op.add(new pq(points[i][0],points[i][1],sq));
        }
        int arr[][]= new int[k][2];
        for(int i=0;i<k;i++){
            arr[i][0]=op.peek().x;
            arr[i][1]=op.peek().y;
            op.remove();
        }
        return arr;
    }
}