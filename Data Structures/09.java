import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input= sc.next();
            System.out.println(valid(input));
        }
    }
            //Complete the code
        static boolean valid(String input){
		Stack<Character> st = new Stack<>();
            for(char ch : input.toCharArray())
            {
                if(ch=='(' || ch=='['||ch=='{'){
                    st.push(ch);
                }
                else if(st.isEmpty()){
                    return false;
                }
                else{
                    char top = st.pop();
                    if(top=='(' && ch!=')' ||top=='[' && ch!=']' ||top=='{' && ch!='}'){
                        return false;
                    }
                }
            }
            return st.isEmpty();
            
		}
	}




