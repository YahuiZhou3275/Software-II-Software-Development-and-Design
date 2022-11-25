import components.stack.Stack;
import components.stack.Stack1L;
import components.stack.Stack2;

/**
 * Customized JUnit test fixture for {@code Stack1L}.
 */
public class Stack2Test extends StackTest {

    @Override
    protected final Stack<String> constructorTest() {

        return new Stack1L<String>();
    }

    @Override
    protected final Stack<String> constructorRef() {

        return new Stack2<String>();
    }

}
