package helpers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// ! Ignore this file if you are a student

public class StacksQueuesHelper {
    
    // convert arraylist to stack in the form bottom [a1, a2, a3, ... an] top
    public static Stack<Integer> arrayListToStack(ArrayList<Integer> al){
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0; i<al.size(); i++)
            st.push(al.get(i));
        return st;
    }

    // convert stack to arraylist in the form bottom [a1, a2, a3, ... an] top
    public static ArrayList<Integer> stackToArrayList(Stack<Integer> st){
        ArrayList<Integer> al = new ArrayList<Integer>();
        Stack<Integer> temp = new Stack<Integer>();
        while(!st.isEmpty())
            temp.push(st.pop());
        while(!temp.isEmpty()){
            int val = temp.pop();
            al.add(val);
            st.push(val);
        }
        return al;
    }

    // convert arraylist to queue in the form front [a1, a2, a3, ... an] back
    public static Queue<Integer> arrayListToQueue(ArrayList<Integer> al){
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0; i<al.size(); i++)
            q.add(al.get(i));
        return q;
    }

    // convert queue to arraylist in the form front [a1, a2, a3, ... an] back
    public static ArrayList<Integer> queueToArrayList(Queue<Integer> q){
        ArrayList<Integer> al = new ArrayList<Integer>();
        int size = q.size();
        for(int i=0; i<size; i++){
            int val = q.remove();
            al.add(val);
            q.add(val);
        }
        return al;
    }
}
