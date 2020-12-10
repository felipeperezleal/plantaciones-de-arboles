public class ChainingHashTable {
	private LinkedList[] harray;
	public ChainingHashTable(int size) {
		harray = new LinkedList[size];
		for(int i=0; i<harray.length; i++)
			harray[i] = new LinkedList();
		}
	public void insert(int n) {
		if(harray[modHash(n)].insert(n))
			System.out.println("item, " + n + ", found, not added");
		}
	public void remove(int n) {
		if(!harray[modHash(n)].delete(n))
			System.out.print("item, " + n + ", not found, not removed");
	}
	public void printHashTable() {
		for(int i=0; i<harray.length; i++) {
			System.out.print("harray[" + i + "] ");
			harray[i].print();
		}
	}
	private int modHash(int key) {
		return key % harray.length;
	}
}