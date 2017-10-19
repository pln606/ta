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

	public ListElement getElement(int index) {
		// Case empty list
		if (ListElement.getHeader() == null) {
			return null;
		}
		// Case existing list
		ListElement temp = ListElement.getHeader();
		// Iterate until index found or eol
		while ((temp.getData() != index) && (temp.getNext() != null))
		{
			temp = temp.getNext();
		}
		// Check if eol.data is index
		if (temp.getData() == index) {
			//true
			return temp;
		}
		else {
			//false
			return null;
		}
	}

	public void addElement(ListElement le) {
		// Case empty le
		if (le == null) {
			return;
		}
		// Case empty list
		if (ListElement.getHeader() == null) {
			ListElement.setHeader(le);
			le.setNext(null);
			le.setPrevious(null);
		}
		// Case existing list
		else {
			ListElement temp = ListElement.getHeader();
			// Iterate until eol
			while (temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			// Set le in list
			temp.setNext(le);
			le.setPrevious(temp);
			le.setNext(null);
		}	
	}

	public ListElement deleteElement(int index) {
		// Get element.data
		ListElement current = getElement(index);
		// Check if index found
		if (current != null) {
			// true
			// Check if element is header
			if (current == ListElement.getHeader()) {
				//true
				ListElement.setHeader(current.getNext());
				return current;
			}
			else {
				//false
				current.setPrevious(current.getNext());
				return current;
			}
		}
		else {
			// false
			return null;
		}
	}


	public void printLinkedListHead() {
		// Case empty list
		if (ListElement.getHeader() == null) {
			return;
		}
		// Case existing list
		else {
			ListElement temp = ListElement.getHeader();
			// Iterate until eol
			while (temp.getNext() != null)
			{
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}
}