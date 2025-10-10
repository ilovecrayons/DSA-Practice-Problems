package solutions.StacksQueues;
import java.util.Queue;
import java.util.Stack;

// TODO: Please turn on word wrap (view -> word wrap)

// ? Stack reference: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
// ? Queue reference: https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html

// TODO: Run your code against the provided test cases in StacksQueuesTest.java (in src/tests) to verify correctness.

public class StacksQueues {
    // TODO: Exercise 1: splitStack
    /**
     * Write a method splitStack that takes a stack of integers as a parameter and splits it into negatives and non-negatives. The numbers in the stack should be rearranged so that all the negatives appear on the bottom of the stack and all the non-negatives appear on the top. In other words, if after this method is called you were to pop numbers off the stack, you would first get all the nonnegative numbers and then get all the negative numbers. It does not matter what order the numbers appear in as long as all the negatives appear lower in the stack than all the non-negatives. You may use a single queue as auxiliary storage.
     */
    public static Stack<Integer> splitStack(Stack<Integer> s){
        return null; 
    }

    // TODO: Exercise 2: stutter
    /**
     * Write a method stutter that takes a stack of integers as a parameter and replaces every value in the stack with two occurrences of that value. For example, suppose the stack stores these values:
     * 
     * bottom [3, 7, 1, 14, 9] top
     * 
     * Then the stack should store these values after the method terminates:
     * 
     * bottom [3, 3, 7, 7, 1, 1, 14, 14, 9, 9] top
     * 
     * Notice that you must preserve the original order. In the original list the 9 was at the top and would have been popped first. In the new stack the two 9s would be the first values popped from the stack. You may use a single queue as auxiliary storage to solve this problem.
     * 
     */
    public static Stack<Integer> stutter (Stack<Integer> s){
        return null; 
    }

    // TODO: Exercise 3: copyStack
    /**
     * Write a method copyStack that takes a stack of integers as a parameter and returns a copy of the original stack (i.e., a new stack with the same values as the original, stored in the same order as the original). Your method should create the new stack and fill it up with the same values that are stored in the original stack. It is not acceptable to return the same stack passed to the method; you must create, fill, and return a new stack.
     *
     * You will be removing values from the original stack to make the copy, but you have to be sure to put them back into the original stack in the same order before you are done. In other words, when your method is done executing, the original stack must be restored to its original state and you will return the new independent stack that is in the same state. You may use one queue as auxiliary storage.
     */
    public static Stack<Integer> copyStack(Stack<Integer> s){
        return null; 
    }

    // TODO: Exercise 8: isPalindrome
    /**
     * Write a method isPalindrome that takes a queue of integers as a parameter and returns true if the numbers in the queue represent a palindrome (and false otherwise). A sequence of numbers is considered a palindrome if it is the same in reverse order. For example, suppose a queue called q stores these values:
     * 
     * front [3, 8, 17, 9, 17, 8, 3] back
     * 
     * Then the call of isPalindrome(q); should return true because this sequence is the same in reverse order. If the queue had instead stored these values:
     * 
     * front [3, 8, 17, 9, 4, 17, 8, 3] back
     * 
     * The call on isPalindrome would instead return false because this sequence is not the same in reverse order (the 9 and 4 in the middle don't match). The empty queue should be considered a palindrome. You may not make any assumptions about how many elements are in the queue and your method must restore the queue so that it stores the same sequence of values after the call as it did before. You may use one stack as auxiliary storage.
     */
    public static boolean isPalindrome(Queue<Integer> q){
        return false; 
    }
    
    // TODO: Exercise 5: equals
    /**
     * Write a method equals that takes as parameters two stacks of integers and returns true if the two stacks are equal and that returns false otherwise. To be considered equal, the two stacks would have to store the same sequence of integer values in the same order. Your method is to examine the two stacks but must return them to their original state before terminating. You may use one stack as auxiliary storage.
     */
    public static boolean equals(Stack<Integer> s1, Stack<Integer> s2){
       return false; 
    }
}
