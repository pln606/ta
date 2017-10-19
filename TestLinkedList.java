import java.util.Scanner;
import linkedlist.LinkedList;
import listelement.ListElement;

public class TestLinkedList {
	public static void main(String args[]) {
		LinkedList newList = new LinkedList();
		Scanner scanIn = new Scanner(System.in);
		String choice = null;
		int tempInt = 0;
		
		System.out.println("This program demonstrates an unsorted linked list\nTo manipulate this list, please choose one of the below\n");
		do {
			System.out.println("A: Add Element\nG: Get an Element\nD: Delete an Element\nP: Print the list\nQ: Quit program\nWhat is your choice?");
			choice = scanIn.nextLine();
			
			switch (choice)
			{
				case "A":
					System.out.println("Please enter a integer value to add to the list: ");
					tempInt = scanIn.nextInt();
					ListElement tempElement = new ListElement();
					tempElement.setData(tempInt);
					newList.addElement(tempElement);
					newList.printLinkedListHead();
					break;
					
				default:
					System.out.println("Please enter a valid choice!");
					break;
			}
			
		}while((choice == "A") || (choice == "G") || (choice == "D") || (choice == "P"));
		
		System.out.println("End of program.");
		scanIn.close();
	}
}