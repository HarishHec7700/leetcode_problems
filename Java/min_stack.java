// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class MinStack{
    public Stack<Integer> stack;
    public Stack<Integer> minStack;     
    public Integer minValue = Integer.MAX_VALUE;
    
    public MinStack(){
        this.stack = new Stack<>();
        this.minStack= new Stack<>();
    }
    
    public Integer top(){
        return stack.peek();
    }
    
    public Integer getMin(){
        if (minStack.isEmpty()) {
            return null;
        }
        return minStack.peek();
    }
    
    public void push(Integer value){
        stack.push(value);
        // Condition for pushing value in the minStack 
        if(minStack.empty() || value <= minStack.peek()){
            minStack.push(value);
        }
    }
    
    public void pop(){
        Integer removedValue = stack.pop();
        if(removedValue == minStack.peek()){
            minStack.pop();
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
    
        MinStack stack = new MinStack();
        
        stack.push(1);
        stack.push(-5);
        stack.push(4);
        stack.push(-2);
        stack.push(-12);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        System.out.println(stack.top());
    }
}