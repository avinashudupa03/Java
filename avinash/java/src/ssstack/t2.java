package ssstack;

import java.util.Stack;

public class t2 {
    public static void main(String[] args) {
        String exp="2 3 + 6 4-";
        String sr[]=exp.split("");
        Stack<Integer>stack=new Stack();
        for(String s:sr)
        {
            if(s.matches("[0-9]+"))
            {
                stack.push(Integer.parseInt(s));
            }
            else{
                int a=stack.pop();
                int b=stack.pop();
                switch(s)
                {
                    case "+"->stack.push(b+a);
                    case "-"->stack.push(b-a);
                }
            }
        }
    }
}
