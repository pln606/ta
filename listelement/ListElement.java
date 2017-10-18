/*
 * ListElement.java
 *
 * DESCRIPTION:
 * Class ListElement for Lab Assignment 3 Phase 1
 *
 * ENSE 374-092 Lab Assignment 3 Phase 1
 * 
 * @author Kelly Holtzman
 * I.D.: 200366225
 */

package listelement;

public class ListElement {
    /* Class ListElement has a constructor for  
     * list elements, including next
     * and previous elements, and element data.
     */
	
	private ListElement next;
	private ListElement previous;
	private int data;
	
	/**
	 * @param data
	 * 		an integer to be stored in the node
	 * @return
	 * 		none
	 **/
	
	public ListElement() {
		this.data = 0; 
		this.next = null;
		this.previous = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
}
