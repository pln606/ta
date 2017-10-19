/*
 * TestListElement.java
 *
 * DESCRIPTION:
 * Class TestListElement for Lab Assignment 3 Phase 1
 *
 * ENSE 374-092 Lab Assignment 3 Phase 1
 * 
 * @author Kelly Holtzman
 * I.D.: 200366225
 */

import listelement.ListElement;

public class TestListElement {
    /* Class TestListElement has creates an object of ListElement
     * for accessing the members ListElement() and setData()
     */
	
	public static void main(String args[]) {
		
		ListElement le = new ListElement();
		le.setData(5);
		
		System.out.println("Initializing ListELement..." + "\n" + "ListElement has data: " + le.getData());
		System.gc();
	}
}
