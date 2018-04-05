import java.util.*;
import java.lang.*;
import java.io.*;

class Answer2{
    static long[] fact;
    public static void main (String[] args) throws java.lang.Exception{
        Scanner in = new Scanner(System.in);
        
        fact = new long[21];
        fact[0] = 1;
        for(int i=1;i<=20;i++){
            fact[i] = fact[i-1]*i;
            //System.out.println(fact[i]+" "+i);
        }
        
        int n = in.nextInt();
        char c;
        for(int i=0;i<n;i++){
            in.next();
        }
        
        String st = in.next();
        
        System.out.println(fun(st)+1);
    }
    static long fun(String s){
        if(s.length()==1)
            return 0;
        
        char[] ar = s.toCharArray();
        Arrays.sort(ar);
        HashMap<Character, Integer> index = new HashMap<Character, Integer>();
        for(int i=0;i<ar.length;i++){
            index.put(ar[i], i);
        }
        long ans = (index.get(s.charAt(0)))*fact[ar.length-1] + fun(s.substring(1));
        //System.out.println(s+" "+ans);
        return ans;
    }
}
