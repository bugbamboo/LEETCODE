class Solution {
    public int numSteps(String s) {
        StringBuilder f = new StringBuilder(s);
        int steps =0;
        while(!f.toString().equals("1")){
        if(f.charAt(f.length()-1)=='1'){
            f.setCharAt(f.length()-1,'0');
            for(int i= f.length()-2; i>-1; i--){
                if(f.charAt(i)=='0'){
                    f.setCharAt(i,'1');
                    break;
                }else if(f.charAt(i)=='1'){
                    f.setCharAt(i,'0');
                }
                if(i==0){
                    f.insert(0,'1');
                }
            }
            steps++;
        }else{
            f.deleteCharAt(f.length()-1);
            steps++;
        }
            
        for(int i=0; i<f.length();i++){
            if(f.charAt(i)=='1'){
                break;
            }else{
                f.deleteCharAt(i);
            }
        }
        
        System.out.println(f);
            
        }
        return steps;
        
    }
}
