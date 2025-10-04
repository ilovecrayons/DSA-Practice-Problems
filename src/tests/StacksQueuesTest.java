package tests;

import java.util.Arrays;
import java.util.ArrayList;

import org.junit.Test;

import solutions.StacksQueues.StacksQueues;

import static org.junit.Assert.assertEquals;

public class StacksQueuesTest {
    @Test // ! Note: I/O are ordered bottom [a1, a2, a3, ... an] top
    public void splitStackTest(){
        ArrayList<ArrayList<Integer>> tests = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(5, -10, 15, 0, -5, 100)),
            new ArrayList<>(Arrays.asList(1, 2, 3, 0, -3, -2, -1)),
            new ArrayList<>(Arrays.asList(-2, -3, 0, 3, 2)),
            new ArrayList<>(Arrays.asList(14, 2, -3, 5, 12, -8, -1, -12, 6)),
            new ArrayList<>(Arrays.asList(0)),
            new ArrayList<>(Arrays.asList())
        ));
        ArrayList<ArrayList<Integer>> results = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(-5, -10, 100, 0, 15, 5)),
            new ArrayList<>(Arrays.asList(-1, -2, -3, 0, 3, 2, 1)),
            new ArrayList<>(Arrays.asList(-3, -2, 2, 3, 0)),
            new ArrayList<>(Arrays.asList(-12, -1, -8, -3, 6, 12, 5, 2, 14)),
            new ArrayList<>(Arrays.asList(0)),
            new ArrayList<>()
        ));
        for(int i=0; i<tests.size(); i++){
            ArrayList<Integer> test = tests.get(i);
            ArrayList<Integer> result = results.get(i);
            ArrayList<Integer> ans = helpers.StacksQueuesHelper.stackToArrayList(StacksQueues.splitStack(helpers.StacksQueuesHelper.arrayListToStack(test)));
            assertEquals("Test case " + i + " failed for input: " + test, result, ans);
        }
        
    }

    @Test // ! Note: I/O are ordered bottom [a1, a2, a3, ... an] top
    public void stutterTest(){
        ArrayList<ArrayList<Integer>> tests = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(3, 7, 1, 14, 9)),
            new ArrayList<>(Arrays.asList(1, 2, 3, 0, -3, -2, -1)),
            new ArrayList<>(Arrays.asList(-2, -3, 0, 3, 2)),
            new ArrayList<>(Arrays.asList(0)),
            new ArrayList<>(Arrays.asList())
        ));
        ArrayList<ArrayList<Integer>> results = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(3, 3, 7, 7, 1, 1, 14, 14, 9, 9)),
            new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 0, 0, -3, -3, -2, -2, -1, -1)),
            new ArrayList<>(Arrays.asList(-2, -2, -3, -3, 0, 0, 3, 3, 2, 2)),
            new ArrayList<>(Arrays.asList(0, 0)),
            new ArrayList<>()
        ));
        for(int i=0; i<tests.size(); i++){
            ArrayList<Integer> test = tests.get(i);
            ArrayList<Integer> result = results.get(i);
            ArrayList<Integer> ans = helpers.StacksQueuesHelper.stackToArrayList(StacksQueues.stutter(helpers.StacksQueuesHelper.arrayListToStack(test)));
            assertEquals("Test case " + i + " failed for input: " + test, result, ans);
        }
    }

    @Test // ! Note: I/O are ordered bottom [a1, a2, a3, ... an] top
    public void copyStackTest(){
        ArrayList<ArrayList<Integer>> tests = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(3, 7, 1, 14, 9)),
            new ArrayList<>(Arrays.asList(1, 2, 3, 0, -3, -2, -1)),
            new ArrayList<>(Arrays.asList(-2, -3, 0, 3, 2)),
            new ArrayList<>(Arrays.asList(0)),
            new ArrayList<>(Arrays.asList())
        ));
        for(int i=0; i<tests.size(); i++){
            ArrayList<Integer> test = tests.get(i);
            ArrayList<Integer> expectedOriginal = new ArrayList<>(test);
            ArrayList<Integer> expectedCopy = new ArrayList<>(test);
            
            java.util.Stack<Integer> originalStack = helpers.StacksQueuesHelper.arrayListToStack(test);
            java.util.Stack<Integer> copiedStack = StacksQueues.copyStack(originalStack);
            
            ArrayList<Integer> actualOriginal = helpers.StacksQueuesHelper.stackToArrayList(originalStack);
            ArrayList<Integer> actualCopy = helpers.StacksQueuesHelper.stackToArrayList(copiedStack);
            
            assertEquals("Test case " + i + " - returned copy doesn't match original for input: " + test, expectedCopy, actualCopy);
            
            assertEquals("Test case " + i + " - original stack was modified for input: " + test, expectedOriginal, actualOriginal);

            assert(originalStack != copiedStack);
        }
    }

    @Test // ! Note: I/O are ordered front [a1, a2, a3, ... an] back
    public void isPalindromeTest(){
        ArrayList<ArrayList<Integer>> tests = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(3, 8, 17, 9, 17, 8, 3)),
            new ArrayList<>(Arrays.asList(3, 8, 17, 9, 4, 17, 8, 3)),
            new ArrayList<>(Arrays.asList()),
            new ArrayList<>(Arrays.asList(1)),
            new ArrayList<>(Arrays.asList(1, 2)),
            new ArrayList<>(Arrays.asList(1, 2, 1)),
            new ArrayList<>(Arrays.asList(5, 10, -1, 4, 3, 2, 4, -1, 10, 5)),
            new ArrayList<>(Arrays.asList(5, 10, -1, 4, 3, 3, 4, -1, 10, 5)),
            new ArrayList<>(Arrays.asList(5, 10, -1, 4, 3, 2, 2, 4, -1, 10, 5)),
            new ArrayList<>(Arrays.asList(5, 10, -1, 4, 3, 4, -1, 10, 5))
        ));
        ArrayList<Boolean> results = new ArrayList<>(Arrays.asList(
            true,   // [3, 8, 17, 9, 17, 8, 3]
            false,  // [3, 8, 17, 9, 4, 17, 8, 3]
            true,   // []
            true,   // [1]
            false,  // [1, 2]
            true,   // [1, 2, 1]
            false,  // [5, 10, -1, 4, 3, 2, 4, -1, 10, 5]
            true,   // [5, 10, -1, 4, 3, 3, 4, -1, 10, 5]
            false,  // [5, 10, -1, 4, 3, 2, 2, 4, -1, 10, 5]
            true    // [5, 10, -1, 4, 3, 4, -1, 10, 5]
        ));
        for(int i=0; i<tests.size(); i++){
            ArrayList<Integer> test = tests.get(i);
            boolean expected = results.get(i);
            boolean actual = StacksQueues.isPalindrome(helpers.StacksQueuesHelper.arrayListToQueue(test));
            assertEquals("Test case " + i + " failed for input: " + test, expected, actual);
        }
    }

    @Test // ! Note: I/O are ordered bottom [a1, a2, a3, ... an] top
    public void equalsTest(){
        ArrayList<ArrayList<Integer>> tests1 = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(7, 2, 8)),
            new ArrayList<>(Arrays.asList(1, 1, 1, 1)),
            new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4)),
            new ArrayList<>(Arrays.asList(0, 1, 2)),
            new ArrayList<>(Arrays.asList(42, 20, 30)),
            new ArrayList<>(Arrays.asList())
        ));
        ArrayList<ArrayList<Integer>> tests2 = new ArrayList<>(Arrays.asList(
            new ArrayList<>(Arrays.asList(7, 2, 8)),
            new ArrayList<>(Arrays.asList(1, 1, 1)),
            new ArrayList<>(Arrays.asList(2, 3, 4)),
            new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4)),
            new ArrayList<>(Arrays.asList(10, 20, 30)),
            new ArrayList<>(Arrays.asList())
        ));
        ArrayList<Boolean> results = new ArrayList<>(Arrays.asList(
            true,   // [7, 2, 8] == [7, 2, 8]
            false,  // [1, 1, 1, 1] != [1, 1, 1]
            false,  // [0, 1, 2, 3, 4] != [2, 3, 4]
            false,  // [0, 1, 2] != [0, 1, 2, 3, 4]
            false,  // [42, 20, 30] != [10, 20, 30]
            true    // [] == []
        ));
        for(int i=0; i<tests1.size(); i++){
            ArrayList<Integer> test1 = tests1.get(i);
            ArrayList<Integer> test2 = tests2.get(i);
            ArrayList<Integer> expectedStack1 = new ArrayList<>(test1);
            ArrayList<Integer> expectedStack2 = new ArrayList<>(test2);
            
            java.util.Stack<Integer> stack1 = helpers.StacksQueuesHelper.arrayListToStack(test1);
            java.util.Stack<Integer> stack2 = helpers.StacksQueuesHelper.arrayListToStack(test2);
            
            boolean expected = results.get(i);
            boolean actual = StacksQueues.equals(stack1, stack2);
            
            ArrayList<Integer> actualStack1 = helpers.StacksQueuesHelper.stackToArrayList(stack1);
            ArrayList<Integer> actualStack2 = helpers.StacksQueuesHelper.stackToArrayList(stack2);
            
            assertEquals("Test case " + i + " failed for stacks: " + test1 + " and " + test2, expected, actual);
            
            assertEquals("Test case " + i + " - first stack was modified: " + test1, expectedStack1, actualStack1);
            assertEquals("Test case " + i + " - second stack was modified: " + test2, expectedStack2, actualStack2);
        }
    }
}

