import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int e = sc.nextInt();
            a.add(e);
        }
        int val = sc.nextInt();
        for(int i=0;i<val;i++){
            String v = sc.next();
            if(v.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                a.add(x,y);
            }
            else{
                 int x = sc.nextInt();
                 a.remove(x);
            }
        }
        Iterator itr = a.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
