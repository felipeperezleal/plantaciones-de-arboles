
package logic;

public class LinkedListArbol<Arbol>{
    private class NodeGeneric<T>{
        private T data;
        private NodeGeneric<T> next;
        public NodeGeneric() {
            this(null);
        }
        public NodeGeneric(T data) {
            this.data = data;
            next = null;
        }
    }
    private NodeGeneric<Arbol>head;
    public LinkedListArbol(){
        head = null;
    }
    public boolean insert(Arbol item) {
        boolean inserted;
        NodeGeneric<Arbol> ptr,prev;
        inserted = false;
        ptr = head;
        prev = null;
        while(ptr != null){
            prev = ptr;
            ptr = ptr.next;
        }
        if(ptr == null || !(ptr.data.equals(item))) {
            inserted = true;
            NodeGeneric<Arbol>newp = new NodeGeneric();
            newp.data = item;
            newp.next = ptr;
            if(prev == null)
                head = newp;
            else
                prev.next = newp;
        }
        return inserted;
    }
    public boolean delete(Arbol item) {
        boolean deleted=false;
        NodeGeneric<Arbol> ptr, prev;
        return deleted;
        //Body of method
    }
    public void printRecursive() {
        System.out.print("List Recursive: ");
        printR(head);
        System.out.println();
    }
    private void printR(NodeGeneric<Arbol> p){
        if(p != null) {
            System.out.print(p.data + "");
            printR(p.next);
        }
    }
}
