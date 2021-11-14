package main;

import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

/**
 * Class to test the classes and methods of this package.
 * 
 * @author rkelley/njohnson/lschoch Programming Project 1 Start Project CS131ON
 */
public class TestLinkedList {
	
	/**
	 * The main method. Instantiates three lists and prints their data.
	 * 
	 * @param args this method does not use command line arguments
	 */
	public static void main(String[] args) {
		// Create integerList
		GenericLinkedList<Integer> integerList = new GenericLinkedList<Integer>();
		// Create nodes for integerList
		GenericNode<Integer> aNode = new GenericNode<Integer>();
		aNode.setData(101);
		integerList.addNode(aNode);
		aNode = new GenericNode<Integer>();
		aNode.setData(202);
		integerList.addNode(aNode);
		aNode = new GenericNode<Integer>();
		aNode.setData(303);
		integerList.addNode(aNode);

		// Create doubleList
		GenericLinkedList<Double> doubleList = new GenericLinkedList<Double>();
		// Create nodes for doubleList
		GenericNode<Double> bNode = new GenericNode<Double>();
		bNode.setData(101.101);
		doubleList.addNode(bNode);
		bNode = new GenericNode<Double>();
		bNode.setData(202.202);
		doubleList.addNode(bNode);
		bNode = new GenericNode<Double>();
		bNode.setData(303.303);
		doubleList.addNode(bNode);

		// Create stringList
		GenericLinkedList<String> stringList = new GenericLinkedList<String>();
		// Create nodes for stringList
		GenericNode<String> cNode = new GenericNode<String>();
		cNode.setData("A string.");
		stringList.addNode(cNode);
		cNode = new GenericNode<String>();
		cNode.setData("Another string.");
		stringList.addNode(cNode);
		cNode = new GenericNode<String>();
		cNode.setData("Last string.");
		stringList.addNode(cNode);

		// Print the data in each list
		System.out.println("\nintegerList:");
		GenericNode<Integer> integerHead = integerList.getList();
		do {
			System.out.println(integerHead.getData());
			integerHead = integerHead.getNextNode();
		} while (integerHead != null);

		System.out.println("\ndoubleList:");
		GenericNode<Double> doubleHead = doubleList.getList();
		do {
			System.out.println(doubleHead.getData());
			doubleHead = doubleHead.getNextNode();
		} while (doubleHead != null);

		System.out.println("\nstringList:");
		GenericNode<String> stringHead = stringList.getList();
		do {
			System.out.println(stringHead.getData());
			stringHead = stringHead.getNextNode();
		} while (stringHead != null);

	}// end main

}// end class
