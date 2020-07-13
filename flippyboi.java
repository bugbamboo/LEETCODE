class Solution {
    public int minFlips(int a, int b, int c) {
        String as = Integer.toBinaryString(a);
        String bs = Integer.toBinaryString(b);
        String cs = Integer.toBinaryString(c);
        int flips = 0;
        int length =0;
        if(length<as.length()){
            length=as.length();
        }
        if(length<bs.length()){
            length=bs.length();
        }
        if(length<cs.length()){
            length=cs.length();
        }
        StringBuilder pad = new StringBuilder();
        if(length>as.length()){
            for(int i=0; i<length-as.length();i++){
                pad.append("0");
            }
        }
        as = pad+as;
        pad =new StringBuilder();
    
        if(length>bs.length()){
            for(int i=0; i<length-bs.length();i++){
                pad.append("0");;
            }
        }
        bs = pad+bs;
        pad =new StringBuilder();
        if(length>cs.length()){
            for(int i=0; i<length-cs.length();i++){
                pad.append("0");;
            }
        }
        cs = pad+cs;
        for(int i=0; i<as.length(); i++){
            int f = Integer.parseInt(as.charAt(i)+"")+Integer.parseInt(bs.charAt(i)+"");
            if(f==2){
                f=1;
            }
            if(f!=Integer.parseInt(cs.charAt(i)+"")){
                if(Integer.parseInt(cs.charAt(i)+"")==1){
                    flips++;
                }else{
                    if(Integer.parseInt(as.charAt(i)+"")==1&&Integer.parseInt(bs.charAt(i)+"")==1){
                        flips+=2;
                    }else{
                        flips++;
                    }
                }
            }
            
        }
        System.out.println(as);
        System.out.println(bs);
        System.out.println(cs);
        return flips;
    }
}
