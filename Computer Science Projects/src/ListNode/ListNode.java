package ListNode;

import java.util.Random;

public class ListNode {
	int data;
	ListNode next;
	public ListNode(int number){
		data=number;
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public static void main(String[] args){
		/*Random numGenerator = new Random();
		int numHead=numGenerator.nextInt();
		ListNode head=new ListNode(numHead);
		ListNode g =new ListNode(numGenerator.nextInt());
		head.setNext(g);
		for(int i=0; i<9; i++){
			g.setNext(new ListNode(numGenerator.nextInt()));
			g.next.setNext(new ListNode(numGenerator.nextInt()));
		}
		ListNode head=new ListNode(0);
		ListNode g=new ListNode(1);
		head.setNext(g);
		makeListNode(g, 8);*/
		ListNode head=new ListNode(0);
		head.setNext(new ListNode(1));
		head.next.setNext(new ListNode(2));
		head.next.next.setNext(new ListNode(3));
		head.next.next.next.setNext(new ListNode(4));
		head.next.next.next.next.setNext(new ListNode(5));
		head.next.next.next.next.next.setNext(new ListNode(6));
		head.next.next.next.next.next.next.setNext(new ListNode(7));
		head.next.next.next.next.next.next.next.setNext(new ListNode(8));
		head.next.next.next.next.next.next.next.next.setNext(new ListNode(9));
		
		
	}
	
	/*public static void makeListNode(ListNode g, int number){
		while(number>0){
			g.setNext(new ListNode(g.getData()+1));
			g.next.setNext(new ListNode(g.next.getData()+1));
			number--;
			makeListNode(g.next, number);
		}
	}*/
	
	public static int getX(ListNode head, int pos){
		ListNode found=head;
		for(int i=0; i<pos; i++){
			if(i==0)found=head.getNext();
			else{
				found=found.getNext();
			}
		}
		return found.getData();
	}
	
	public static void insert(ListNode oldList, int  loc, ListNode newList){
		
	}
}