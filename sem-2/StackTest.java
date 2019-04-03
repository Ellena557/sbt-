package java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    public static final String VALUE = "123";
    public static final String ANOTHER_VALUE = "456";

    @Test
    public void testNewStackIsEmpty(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackIsNotEmptyAfterPush(){
        Stack stack = new Stack();
        stack.push("123");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPopReturnsLastPushedValue(){
        Stack stack = new Stack();
        stack.push(VALUE);
        stack.push(ANOTHER_VALUE);
        assertEquals(ANOTHER_VALUE, stack.pop());
    }

    @Test
    public void testPop2Times(){
        Stack stack = new Stack();
        stack.push(VALUE);
        stack.push(ANOTHER_VALUE);
        stack.pop();
        assertEquals(VALUE, stack.pop());
    }
}