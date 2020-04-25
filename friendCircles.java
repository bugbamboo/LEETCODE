import java.util.HashSet;
class Solution {
    public int[] id;
    public int findCircleNum(int[][] M) {
        int n = M.length;
        init(n);
        for(int r=0; r<n; r++){
            for(int d=0; d<n; d++){
                if(M[r][d]== 1){
                    union(r,d);
                }
            }
        }
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int s: id){
            hset.add(s);
        }
        return hset.size();
    }
    public void init(int N){
        id = new int[N];
        for(int i=0; i<N; i++){
            id[i] = i;
        }
    }
    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for(int i=0; i<id.length; i++){
            if(id[i]== pid){
                id[i] = qid;
            } 
        }
    }
}
