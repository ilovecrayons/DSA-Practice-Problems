package stutter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Tests {
    /**
     * Provides a stream of arguments to be passed sequentially to a test method.
     * The arguments are given as <input, expectedResult> pair, each of which are stacks in their ArrayList representation.
     * The ArrayList representation of a stack is an ordered list of numbers, as follows:
     * <pre>
     * bottom [a1, a2, a3, ... an] top
     * </pre>
     */
    private static Stream<Arguments> stutterProvider(){
        return Stream.of(
            Arguments.of(
                /* input */    new ArrayList<>(Arrays.asList(3, 7, 1, 14, 9)),
                /* expected */ new ArrayList<>(Arrays.asList(3, 3, 7, 7, 1, 1, 14, 14, 9, 9))
            ),
            Arguments.of(
                /* input */    new ArrayList<>(Arrays.asList(1, 2, 3, 0, -3, -2, -1)),
                /* expected */ new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 0, 0, -3, -3, -2, -2, -1, -1))
            ),
            Arguments.of(
                /* input */    new ArrayList<>(Arrays.asList(-2, -3, 0, 3, 2)),
                /* expected */ new ArrayList<>(Arrays.asList(-2, -2, -3, -3, 0, 0, 3, 3, 2, 2))
            ),
            Arguments.of(
                /* input */    new ArrayList<>(Arrays.asList(0)),
                /* expected */ new ArrayList<>(Arrays.asList(0, 0))
            ),
            Arguments.of(
                /* input */    new ArrayList<>(Arrays.asList()),
                /* expected */ new ArrayList<>(Arrays.asList())
            )
        );
    }

    @ParameterizedTest(name = "case {index}: input={0} => expected={1}")
    @MethodSource("stutterProvider")
    public void stutterTest(ArrayList<Integer> input, ArrayList<Integer> expectedResult) {
        // Prepare the input
        Stack<Integer> inputStack = helpers.StacksQueuesHelper.arrayListToStack(input);

        // Call the user code
        Stack<Integer> actualStack = Solution.stutter(inputStack);

        // Assert the actual result meets expectations
        assertNotNull(actualStack);
        ArrayList<Integer> actualResult = helpers.StacksQueuesHelper.stackToArrayList(actualStack);
        assertEquals(
            actualResult,
            expectedResult,
            String.format("actual={%s}", actualResult));
    }
}
