/*
 * TestLinkedList.java
 *
 * DESCRIPTION:
 * Class ListElement for Lab Assignment 3 Phase 1
 *
 * ENSE 374-092 Lab Assignment 3 Phase 1
 * 
 * @author Kelly Holtzman
 * I.D.: 200366225
 */

import java.util.Scanner;
import linkedlist.LinkedList;
import listelement.ListElement;

public class TestLinkedList {
	/* Class TestLinkedList has a menu for  
	 * manipulating an unsorted linked list.
	 */
	
	public static void main(String args[]) {
		LinkedList newList = new LinkedList();
		Scanner scanIn = new Scanner(System.in);
		char choice = 0;
		int tempInt = 0;
		
		System.out.println("This program demonstrates an unsorted linked list\nTo manipulate this list, please choose one of the below:\n");
		System.out.println("A: Add Element\nG: Get an Element\nD: Delete an Element\nP: Print the list\nR: Run menu again\nQ: Quit program");
		
		menuLoop: while (true) 
		{
			System.out.println("What is your choice?");
			choice = scanIn.next().charAt(0);
			
			switch (choice)
			{
				case 'A':
					System.out.println("Please enter an integer value to add to the list: ");
					tempInt = scanIn.nextInt();
					ListElement tempElement = new ListElement();
					tempElement.setData(tempInt);
					newList.addElement(tempElement);
					newList.printLinkedListHead();
					break;
				
				case 'G':
					System.out.println("Please enter an integer value to find in the list: ");
					tempInt = scanIn.nextInt();
					if (newList.getElement(tempInt) == null) {
						System.out.println("Could not find the item");
					}
					else {
						System.out.println("The item exists in the list");
						newList.printLinkedListHead();
					}
					break;
					
				case 'D':
					System.out.println("Please enter an integer value to be deleted from the list");
					tempInt = scanIn.nextInt();
					if (newList.deleteElement(tempInt) == null) {
						System.out.println("Could not find the item");
					}
					else {
						System.out.println("The item has been deleted from the list");
						newList.printLinkedListHead();
					}
					break;
					
				case 'P':
					newList.printLinkedListHead();
					break;
					
				case 'R':
					System.out.println("A: Add Element\nG: Get an Element\nD: Delete an Element\nP: Print the list\nR: Run menu again\nQ: Quit program");
					break;
					
				case 'Q':
					break menuLoop;
					
				default:
					System.out.println("Please enter a valid choice!");
					break;
			}
		}
		
		System.out.println("End of program.");
		scanIn.close();
		System.gc();
	}
}