import java.util.Scanner;
class Solution {
    public static boolean isValid(String s) {
        //i use for-each loop to store string in a array and iterate on each element of the string to store in a array make it easy to iterate on each of the element.
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                if((ch == ')' && top != '(')||
                (ch == '}' && top != '{')||
                (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
            //for giving input in a string, input like bracets.
            Scanner sc=new Scanner(System.in);
            String input=sc.nextLine();
            if(isValid(input)){
                System.out.println("valid bracets");
            }else{
                System.out.println("invalid bracets");
            }
            
            
        }
}