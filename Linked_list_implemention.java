package Labs;
import java.util.*;
import java.lang.*;
import java.io.*;

class node{
	int data;
	node next;
}

class Linked{
	node head;
	public void add(int n) {
		node Node = new node();
		Node.data = n;
		if(head==null) {
			head = Node;
		}
		else {
			node k = head;
			while(k.next!=null) {
				k = k.next;
			}
			k.next= Node;
		}
	}
	public void addAtStart(int data) {
		node Node = new node();
		Node.data = data;
		Node.next = head;
		head = Node;
	}
	public void addAt(int index , int data) {
		node Node =  new node();
		Node.data = data;
		node n = head;
		if(index==0) {
			addAtStart(data);
		}
		else {
			for(int i=0;i<index-1;i++){
				n = n.next;
			}
			Node.next = n.next;
			n.next = Node;
		}
		
	}
	public void show() {
		node Node = head;
		while(Node.next!=null) {
			System.out.println(Node.data);
			Node = Node.next;
		}
		System.out.println(Node.data);
	}
	public void remove(int index) {
		node n = head;
		if(index  ==0 ) {
			head = head.next;
		}
		else {
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
			n.next = n.next.next;
		}
		
	}
}
public class Ritik
{
	public static void main (String[] args) throws java.lang.Exception{
		Linked list = new Linked();	
		list.add(5);
		list.add(8);
		list.add(9);
		list.addAt(0, 4);
		list.addAtStart(2);
		list.remove(2);
		list.show();
	}	
}
