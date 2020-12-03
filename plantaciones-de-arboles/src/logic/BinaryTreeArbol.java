package logic;

import logic.Node;    

public class BinaryTreeArbol<Arbol>{
    public Node root;
    public Node puntero;
    
    public BinaryTreeArbol() {
        root = null;
    }
    
    public void insertBST(int num) {
        root = insert(num,root);
        puntero = root;
    }
    
    private Node insert(int num, Node p) {
        if(p == null)
            p = new Node(num);
        else
            if(num < p.data)
                p.left = insert(num,p.left);
            else
                if(num > p.data)
                    p.right = insert(num,p.right);
                else
                    System.out.println("Item in tree and not inserted.");
        return p;
    }
    
    public void removeBST(int num){
        root = remove(num,root);
    }
    
    private Node remove(int num, Node p){
        if(p != null){
            if(num < p.data)
                p.left = remove(num,p.left);
            else
                if(num > p.data)
                    p.right = remove(num,p.right);
                else
                    if(p.left ==null && p.right ==null)
                        p = null;
                    else
                        if(p.left ==null)
                            p = p.right;
                        else
                            if(p.right ==null)
                                p = p.left;
                            else {
                                Node t = findMin(p.right);
                                p.data = t.data;
                                p.right = remove(p.data,p.right);
                                p.right = remove(p.data,p.right);
                            }
        }else
            System.out.println("Item not in tree and not removed");
        return p;
    }
    
    private Node findMin(Node p) {
        if(p != null)
            while(p.left != null)
                p = p.left;
                return p;
    }
    
    public void traverseBST() {
        if(root!= null)
            traverse(root);
        else
            System.out.print("Empty");
        System.out.println();
    }
    private void traverse(Node ptr) {
        if(ptr.left != null)
            traverse(ptr.left);
        System.out.print(ptr.data);
        if(ptr.right != null)
            traverse(ptr.right);
    }

    public void goLeft(){
        puntero = puntero.left;
    }
    
    public void goRight(){
        puntero = puntero.right;
    }
}
