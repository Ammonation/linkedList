package linkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList myList = new LinkedList();	// Creates a new list
			System.out.println("The length of myList is:" + myList.getLength()); //Outputs its length to the terminal, should be 0
			System.out.println("The head is:" + myList.head); //Outputs the head value, should be NULL
			/*
			 * Create some students
			 */
			Student harry = new Student("Harry",1);
			Student andy = new Student("Andy",2);
			Student james = new Student("James",3);
			
			/*
			 * Create new nodes
			 * Add nodes to list
			 */
			Node n1 = new Node(harry);
			Node n2 = new Node(andy);
			Node n3 = new Node(james);
			myList.add(n1);
			myList.add(n2);
			myList.add(n3);
			
			
			/*int [] data = myList.getAllData();
			System.out.println(data.length);
			for(int i = 0;i < data.length;i++) {
				System.out.println(data[i]);
			}*/
			
			System.out.println(myList.get(0).getName());
			System.out.println(myList.get(1).getName());
			System.out.println(myList.get(2).getName());
			
			System.out.println(myList.contains("Andy"));
			System.out.println(myList.contains(2));
	}

}
