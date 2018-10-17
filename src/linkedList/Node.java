package linkedList;

public class Node {
	private Student data;
	private Node n;
	
	public Node(Student i) {
		data = i; // This contains the data, in this case an integer
		n = null; // This will point to the next node in the list.
	}
	
	public Node getNext() {
		return n;
	}
	
	public void updatePointer(Node x) {
		n = x;
	}
	
	public Student getData() {
		return data;
	}
}
