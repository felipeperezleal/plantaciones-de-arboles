package logic;

public class ArrayListArbol<Arbol> {
    static private final int N=5;
    private int position, count;
    private Arbol[] larray;
    
    public ArrayListArbol() {
        count=0;
        larray = (Arbol[]) new Object[N];
    }
    
    private boolean empty() {
        return count<=0;
    }
    private boolean full() {
        return count>=N;
    }
    public boolean delete(Arbol item) {
        boolean deleted=false;
        if(!empty())
            if(search(item)) {
                for(int j = position; j <count-1; j++)
                    larray[j] = larray[j+1];
                    count--;
                deleted = true;
            }
        else
            System.out.println("List is Empty");
        return deleted;
    }
    public boolean insert(Arbol item) {
        boolean inserted=false;
        if(!full())
            if(!search(item)) {
                for(int j=count; j>position; j--)
                    larray[j] = larray[j-1];
                    larray[position] = item;
                    count++;
                inserted = true;
            }
        else
            System.out.println("List is Full");
        return inserted;
    }
    private boolean search(Arbol item) {
        boolean found=false, stop=false;
        position = 0;
        while(position < count && !stop)
            if(larray[position].equals(item)) {
                stop = true;
                if(larray[position] == item)
                    found = true;
            }
            else
                position++;
        return found;
    }
    public void output() {
        System.out.print("List: ");
        int j = 0;
        while(j != count) {
            System.out.print(larray[j]+" ");
            j++;
        }
        System.out.println();
    }

    class NodeGeneric<T> {
        private T data;
        private NodeGeneric<T> next;
        public NodeGeneric() {
            this(null);
        }
        public NodeGeneric(T data) {
            this.data = data;
            next = null;
        }
        public T getData() {
            return data;
        }
        public void setData(T data) {
            this.data = data;
        }
        public NodeGeneric getNext() {
            return next;
        }
        public void setNext(NodeGeneric<T> next) {
            this.next = next;
        }
    }
}