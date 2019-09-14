class Node{
	int data;
	Node next;
}
class LinkedList{
	 Node head;

	 public void insert(int data){
	 	Node node = new Node();
	 	node.data = data;
	 	node.next = null;

	 	if(head == null){
	 		head = node;
	 	}else{
	 		Node n = head;
	 		while(n.next!=null){
	 			n = n.next;
	 		}
	 		n.next = node;
	 	}
	 }

	 public void insertAtStart(int data){
	 	Node node = new Node();
	 	node.data = data;
	 	node.next = null;

	 	node.next = head;

	 	head = node; 
	 }

	 public void insertAt(int index , int data){
	 	Node node = new Node();
	 	node.data = data;
	 	node.next = null;

	 	if(index == 0){
	 		insertAtStart(data);
	 	}else{
	 		Node n = head;
		 	for(int i =0;i<index-1;i++){
		 		n = n.next;
		 	}
		 	node.next = n.next;
		 	n.next = node;
	 	}
	 
	 }

	 public void deleteAt(int index){
	 	if(index == 0){
	 		head = head.next;
	 	}else{
	 		Node n = head;
	 		Node n1 = null;
	 		for(int i =0;i<index-1;i++){
	 			n = n.next;
	 		}
	 		n1 = n.next;
	 		n.next = n1.next;
	 	}
	 }

	 public void show(){
	 	Node node = head;
	 	while(node.next!=null){
	 		System.out.println(node.data);
	 		node = node.next;
	 	}
	 	System.out.println(node.data);
	 }
}
public class Runner{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(13);
		list.insert(23);
		list.insert(45);
		list.insertAtStart(20);
		list.insertAt(2,33);

		list.deleteAt(3);
		list.show();
	}
}