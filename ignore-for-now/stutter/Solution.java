package stutter;

import java.util.Stack;

/**
 * <a href="https://codestepbystep.com/r/problem/view/java/bjp5/chapter14/e2-stutter">
 * CodeStepByStep / Java / Building Java Programs, 5th edition / BJP5 Chapter 14 / Exercise 2: stutter
 * </a>
 */
public class Solution {

    /**
     * <p>
     * Write a method stutter that takes a stack of integers as a parameter and replaces every value in the stack
     * with two occurrences of that value. For example, suppose the stack stores these values:
     * </p>
     * <pre>
     * bottom [3, 7, 1, 14, 9] top
     * </pre>
     * <p>
     * Then the stack should store these values after the method terminates:
     * </p>
     * <pre>
     * bottom [3, 3, 7, 7, 1, 1, 14, 14, 9, 9] top
     * </pre>
     * <p>
     * Notice that you must preserve the original order. In the original list the 9 was at the top and would have been popped first.
     * In the new stack the two 9s would be the first values popped from the stack.
     * </p>
     * <p>
     * You may use a single queue as auxiliary storage to solve this problem.
     * </p>
     * @param s - Stack of integers.
     * @return Stack where each number is duplicated while maintaining its relative position in the stack.
     * 
     */
    public static Stack<Integer> stutter(Stack<Integer> s) {
        // TODO: Insert your solution below
        return null; 
    }
}
