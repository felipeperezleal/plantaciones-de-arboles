package logic;

public class StackArbol<Arbol> {
	private static final int N = 10;
	private int top;
	private Arbol[] tArray;

	public StackArbol() {
            this(N);
	}
	public StackArbol(int n) {
            top = 0;
            tArray = (Arbol[]) new Object[n];
	}

	public boolean empty() {
            return top <= 0;
	}
	public boolean full() {
            return top >= tArray.length;
	}
	public Arbol pop() {
            if(empty())
                throw new RuntimeException("La pila está vacía");
            top--;
            return tArray[top];
	}

	public void push(Arbol item) {
	if(full())
            throw new RuntimeException("La pila está llena");
            tArray[top]=item;
	top++;
	}
        
        public Arbol peek(){
            return tArray[top];
	}
}
