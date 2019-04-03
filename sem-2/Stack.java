package java;

import java.util.LinkedList;

public class Stack {

    private boolean isEmpty = true;
    private LinkedList<String> stack = new LinkedList<String>();

    public boolean isEmpty(){
        return isEmpty;
    }

    public void push(String value){
        isEmpty = false;
        stack.add(value);
    }

    public String pop(){
        return stack.remove(stack.size()-1);
    }
}
