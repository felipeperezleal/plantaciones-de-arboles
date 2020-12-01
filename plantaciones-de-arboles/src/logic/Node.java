package logic;

public class Node {
        public Node left;
        public int data;
        public Node right;
        public Node(){
            this(0);
        }
        public Node(int data) {
            left = null;
            this.data = data;
            right = null;
        }
    }