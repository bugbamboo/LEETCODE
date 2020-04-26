import java.util.*;
class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> x = new ArrayList<List<String>>();
        int f=0;
        for(int i=0; i<strings.length;i++){
            for(List<String> y : x){
                if(compare(y.get(0),strings[i])){
                    y.add(strings[i]);
                    f=1;
                    break;
                }
            }
            if(f==1){
                f=0;
            }else{
                x.add(new ArrayList<String>());
                x.get(x.size()-1).add(strings[i]);
            }
        }
        
    
            return x;
    }
    public boolean compare(String a,String b){
        if(a.length()!= b.length()){
            return false;
        }
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int i=0; i < a.length();i++){
            int d = ((int)a.charAt(i))-((int)b.charAt(i));
            if(d<=0){
                hset.add(d+26);
            }else{
                hset.add(d);
            }
            
            if(hset.size()>1){
                return false;
            }
        }
        return true;
    }
}
