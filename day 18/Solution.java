public class Solution {
    // Write your code here.
    LinkedList<Character> queue = new LinkedList<>();
    Stack<Character> stack = new Stack<>();
    
    
    public void enqueueCharacter(char c){
        queue.addLast(c);
    }
    
    public char dequeueCharacter(){
        return queue.remove(0);
    }
        
    void pushCharacter(char ch){
        stack.push(ch);
    }
    char popCharacter(){
        return stack.pop();
    }
}
    