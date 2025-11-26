public class StackADT<T> {

    private T[] stack;
    private int top; // số lượng phần tử
    private int capacity;
    private final int DEFAULT_CAPACITY = 100;

    @SuppressWarnings("unchecked")
    public StackADT() {
        this.capacity = DEFAULT_CAPACITY;
        this.stack = (T[]) new Object[capacity];
        this.top = 0; // stack rỗng
    }

    public void push(T value) {
        if (top == capacity) {
            resize();
        }
        stack[top++] = value;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T value = stack[--top];
        stack[top] = null;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        capacity *= 2;
        T[] newStack = (T[]) new Object[capacity];
        for (int i = 0; i < top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }
}
