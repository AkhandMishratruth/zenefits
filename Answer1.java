import java.util.*;
import java.lang.*;
import java.io.*;

class Answer1{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        System.out.println(st);
        fun(st);
    }
    static void fun(String st){
        if(st.length()==1){
            if(st.equals("0"))
                return;
            System.out.println(st);
            return;
        }
        String[] ar = st.substring(1, st.length()-1).split(", ");
        //System.out.println(st);
        fun(ar[1]);
        fun(ar[0]);
        fun(ar[2]);
    }
}
