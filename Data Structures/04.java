import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> a1 = new ArrayList<ArrayList<Integer>>();
        int d =sc.nextInt();
        for(int i=0;i<d;i++){
        ArrayList<Integer> a = new ArrayList<>();
        int n = sc.nextInt();
        for(int j=0;j<n;j++){
            int e = sc.nextInt();
            a.add(e);
        }
        a1.add(a);
     }
        
        int val = sc.nextInt();
        for(int i=0;i<val;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>a1.size() || y>a1.get(x-1).size()){
                System.out.println("ERROR!");
            }
            else{
                System.out.println(a1.get(x-1).get(y-1));
            }
        }
    }
}
