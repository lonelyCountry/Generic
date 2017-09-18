package com.lonelyCountry.test;

import com.lonelyCountry.stack.Stack;
import com.lonelyCountry.stack.StackGeneric;
import org.junit.Test;

public class StackTest {
    @Test
    public void test1() {
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    @Test
    public void test2() {
        StackGeneric<String> stack = new StackGeneric<>();
        stack.push("11");
        stack.push("22");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
