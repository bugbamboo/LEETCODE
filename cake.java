class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long[] hi = new long[horizontalCuts.length+1];
        long[] v = new long[verticalCuts.length+1];
        for(int i = 0; i<hi.length; i++){
            if(i==0){
                hi[i]=horizontalCuts[i];
            }
            else if(i==hi.length-1){
                hi[i]=h-horizontalCuts[horizontalCuts.length -1];
            }else{
                hi[i]=horizontalCuts[i]-horizontalCuts[i-1];
            }
            
        }
        for(int i = 0; i<v.length; i++){
            if(i==0){
                v[0]=verticalCuts[0];
            }
            else if(i==v.length-1){
                v[i]=w-verticalCuts[verticalCuts.length -1];
            }else{
                v[i]=verticalCuts[i]-verticalCuts[i-1];
            }
            
        }
        Arrays.sort(hi);
        Arrays.sort(v);
        System.out.println(Arrays.toString(hi));
        System.out.println(Arrays.toString(v));
        long x =  (hi[hi.length-1]*v[v.length-1])%1000000007;
        int f=(int) x;
        return f;
    }
}
