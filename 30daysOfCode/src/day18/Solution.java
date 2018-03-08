package day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by himu on 3/5/2018.
 */
public class Solution {

    Stack<Character> stack = new Stack();
    Queue<Character> queue = new LinkedList();

    void pushCharacter(char ch){
        stack.push(ch);

    }
    void enqueueCharacter(char ch){
        queue.add(ch);

    }

    char popCharacter(){
    return  stack.pop();

    }
    char dequeueCharacter(){
    return queue.poll();

    }
}
