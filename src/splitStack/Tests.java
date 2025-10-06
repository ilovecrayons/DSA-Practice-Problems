package splitStack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

public class Tests {

    /**
     * Provides a stream of arguments to be passed sequentially to a test method.
     * The arguments are given as <input, expectedResult> pair, each of which are stacks in their ArrayList representation.
     * The ArrayList representation of a stack is an ordered list of numbers, as follows:
     * <pre>
     * bottom [a1, a2, a3, ... an] top
     * </pre>
     */
    private static Stream<Arguments> splitStackProvider(){
        return Stream.of(
            Arguments.of(
                /* testId */   1,
                /* input */    new ArrayList<>(Arrays.asList(5, -10, 15, 0, -5, 100)),
                /* expected */ new ArrayList<>(Arrays.asList(-5, -10, 100, 0, 15, 5))
            ),
            Arguments.of(
                /* testId */   2,
                /* input */    new ArrayList<>(Arrays.asList(1, 2, 3, 0, -3, -2, -1)),
                /* expected */ new ArrayList<>(Arrays.asList(-1, -2, -3, 0, 3, 2, 1))
            ),
            Arguments.of(
                /* testId */   3,
                /* input */    new ArrayList<>(Arrays.asList(-2, -3, 0, 3, 2)),
                /* expected */ new ArrayList<>(Arrays.asList(-3, -2, 2, 3, 0))
            ),
            Arguments.of(
                /* testId */   4,
                /* input */    new ArrayList<>(Arrays.asList(14, 2, -3, 5, 12, -8, -1, -12, 6)),
                /* expected */ new ArrayList<>(Arrays.asList(-12, -1, -8, -3, 6, 12, 5, 2, 14))
            ),
            Arguments.of(
                /* testId */   5,
                /* input */    new ArrayList<>(Arrays.asList(0)),
                /* expected */ new ArrayList<>(Arrays.asList(0))
            ),
            Arguments.of(
                /* testId */   6,
                /* input */    new ArrayList<>(),
                /* expected */ new ArrayList<>()
            )
        );
    }

    @ParameterizedTest(name = "case {index}")
    @MethodSource("splitStackProvider")
    public void splitStackTest(int testId, ArrayList<Integer> input, ArrayList<Integer> expectedResult) {
        // Prepare the input
        Stack<Integer> inputStack = helpers.StacksQueuesHelper.arrayListToStack(input);

        // Call the user code
        Stack<Integer> actualStack = Solution.splitStack(inputStack);

        // Assert the actual result
        assertNotNull(actualStack);
        ArrayList<Integer> actualResult = helpers.StacksQueuesHelper.stackToArrayList(actualStack);
        assertEquals(
            actualResult,
            expectedResult,
            String.format("Test %d failed for input: %s", testId, input));
    }
}
