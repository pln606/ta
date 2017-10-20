/*
 * LinkedList.java
 *
 * DESCRIPTION:
 * Class LinkedList for Lab Assignment 3 Phase 2
 *
 * ENSE 374-092 Lab Assignment 3 Phase 2
 * 
 * @author Kelly Holtzman
 * I.D.: 200366225
 */

package linkedlist;

import listelement.ListElement;

public class LinkedList {
	/* Class LinkedList has methods for manipulating
	 * Class ListElement objects.
	 * 
	 * Method is head -> tail traversing and
	 * 			tail -> head traversing.
	 * 
	 */
	
	private static ListElement header = null;
	private static ListElement tail = null;
	
	public static void setHeader(ListElement header) {
		LinkedList.header = header;
	}
	
	public static void setTail(ListElement tail) {
		LinkedList.tail = tail;
	}

	public static ListElement getHeader() {
		return header;
	}
	
	public static ListElement getTail() {
		return tail;
	}

	public ListElement getElement(int index) {
		if (LinkedList.getHeader() == null) {
			System.out.println("The List is empty!");
			return null;
		}

		ListElement temp = LinkedList.getHeader();

		while ((temp.getData() != index) && (temp.getNext() != null))
		{
			temp = temp.getNext();
		}

		if (temp.getData() == index) {
			return temp;
		}
		else {
			return null;
		}
	}

	public void addElement(ListElement le) {
		if (le == null) {
			return;
		}
		
		if (LinkedList.getHeader() == null) {
			LinkedList.setHeader(le);
			LinkedList.setTail(le);
			le.setNext(null);
			le.setPrevious(null);
		}
		else {
			ListElement tempHeader = LinkedList.getHeader();

			while (tempHeader.getNext() != null)
			{
				tempHeader = tempHeader.getNext();
			}

			tempHeader.setNext(le);
			LinkedList.setTail(le);
			le.setPrevious(tempHeader);
			le.setNext(null);
		}	
	}

	public ListElement deleteElement(int index) {
		ListElement current = getElement(index);

		if (current != null) {
			if ((current == LinkedList.getHeader()) && (current == LinkedList.getTail())) {
				LinkedList.setHeader(null);
				LinkedList.setTail(null);
				return current;
			} 
			else if ((current == LinkedList.getHeader()) && (current != LinkedList.getTail())) {
				LinkedList.setHeader(current.getNext());
				current.getNext().setPrevious(null);
				return current;
			} 
			else if ((current != LinkedList.getHeader()) && (current != LinkedList.getTail())){
				current.getPrevious().setNext(current.getNext());
				current.getNext().setPrevious(current.getPrevious());
				current.setPrevious(current.getNext());
				return current;
			}
			else {
				LinkedList.setTail(current.getPrevious());
				current.getPrevious().setNext()
				current.setPrevious(current.getNext());
				return current;
			}
		}
		else {
			return null;
		}
	}

	public void printLinkedListHead() {
		if (LinkedList.getHeader() == null) {
			System.out.println("The List is empty!");
			return;
		}
		else {
			ListElement temp = LinkedList.getHeader();
			System.out.println("The linked list is:");

			while (temp != null)
			{
				System.out.println(temp.getData() + "->");
				temp = temp.getNext();
			}
		}
	}
	
	public void printLinkedListTail() {
		if (LinkedList.getTail() == null) {
			System.out.println("The List is empty!");
			return;
		}
		else {
			ListElement temp = LinkedList.getTail();
			System.out.println("The linked list is:");

			while (temp != null)
			{
				System.out.println(temp.getData() + "->");
				temp = temp.getPrevious();
			}
		}
	}
}