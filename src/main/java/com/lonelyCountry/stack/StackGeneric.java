package com.lonelyCountry.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class StackGeneric<T> {
    private T[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public StackGeneric() {
        elements = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(T e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        T result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            List<String> list = new ArrayList<>();
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
