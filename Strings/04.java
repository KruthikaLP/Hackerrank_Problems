import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length())
        return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        char c1[]=a.toCharArray();
        char c2[]=b.toCharArray();
        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);
        a=String.valueOf(c1);
        b=String.valueOf(c2);

        if(a.equals(b))
        return true;
        else
        return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
