/*
 * LinkedList.java
 *
 * DESCRIPTION:
 * Class LinkedList for Lab Assignment 3 Phase 1
 *
 * ENSE 374-092 Lab Assignment 3 Phase 1
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
	 * Method is head -> tail traversing.
	 * 
	 */
	
	private static ListElement header = null;
	
	public static void setHeader(ListElement header) {
		LinkedList.header = header;
	}

	public static ListElement getHeader() {
		return header;
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
			le.setNext(null);
			le.setPrevious(null);
		}
		else {
			ListElement temp = LinkedList.getHeader();

			while (temp.getNext() != null)
			{
				temp = temp.getNext();
			}

			temp.setNext(le);
			le.setPrevious(temp);
			le.setNext(null);
		}	
	}

	public ListElement deleteElement(int index) {
		ListElement current = getElement(index);

		if (current != null) {
			if (current == LinkedList.getHeader()) {
				LinkedList.setHeader(current.getNext());
				return current;
			}
			else {
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
}