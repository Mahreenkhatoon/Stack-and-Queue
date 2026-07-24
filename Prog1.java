//using stack,determine whether the expression is valid or not 
//note that this expression doesn't contain oprands or operator  but only paranthesis
// i/p {} o/p true  i/p{[]}  o/p true  i/p ] o/p false  i/p{(})  o/p false
//logic- Read the expression from left to right, if it is opeing parenthesis,push it in stack.
//if it is closing parenthesis, pop the opeing parenthesis from stack
//and check wether it matches with closing parenthesis or not 

import java.util.Stack;
import java.util.Scanner;

class Prog1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the expression : ");
        String exp=sc.next();
        System.out.println("is expression valid or not ?"+isValid(exp));
    }
    static boolean isValid(String exp){
        Stack<Character> s=new Stack<>();   // not char bcoz char is pdt and generics in
                                         //  java support Object types only
         //analyse each character                                
       for(int i=0;i<exp.length();i++){
        char c1=exp.charAt(i);   //String do not support indexing
          if(c1=='{' || c1=='(' || c1=='[')
             s.push(c1);
           else
            {
                //case-1 check whether stack is empty or not 
                if(s.isEmpty())
                    return false;
                char c2=s.pop();   //opening paranethesis
                if((c1=='}'&& c2!='{')||(c1==')' && c2!='(') ||(c1==']' && c2!='[') )
                     return false;
            } 
       }
       //end of expression reached
       //case-2 if stack is not empty, it means some opeing parenthesis remain in stack
       if(!s.isEmpty())
        return false;
    return true;
}
}