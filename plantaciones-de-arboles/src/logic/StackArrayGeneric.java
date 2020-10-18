package logic;

public class StackArrayGeneric<T> {
	private static final int N = 10;
	private int top;
	private T[] sarray;

	public StackArrayGeneric() {
            this(N);
	}
	public StackArrayGeneric(int n) {
            top = 0;
            sarray = (T[]) new Object[n];
	}

	public boolean empty() {
            return top <= 0;
	}
	public boolean full() {
            return top >= sarray.length;
	}
	public T pop() {
            if(empty())
                throw new RuntimeException("Stack is empty");
            top--;
            return sarray[top];
	}

	public void push(T item) {
	if(full())
            throw new RuntimeException("Stack is full");
            sarray[top]=item;
	top++;
	}
}
