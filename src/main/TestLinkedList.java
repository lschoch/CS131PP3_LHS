package main;

import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// Create integerList
		GenericLinkedList<Integer> integerList=new GenericLinkedList<Integer>();
		// Create nodes for integerList
		GenericNode<Integer> aNode=new GenericNode<Integer>();
		aNode.setData(101);
		integerList.addNode(aNode);
		aNode = new GenericNode<Integer>();
		aNode.setData(202);
		integerList.addNode(aNode);
		aNode = new GenericNode<Integer>();
		aNode.setData(303);
		integerList.addNode(aNode);
		
		// Create doubleList
		GenericLinkedList<Double> doubleList=new GenericLinkedList<Double>();
		// Create nodes for doubleList
		GenericNode<Double> bNode=new GenericNode<Double>();
		bNode.setData(101.101);
		doubleList.addNode(bNode);
		bNode = new GenericNode<Double>();
		bNode.setData(202.202);
		doubleList.addNode(bNode);
		bNode = new GenericNode<Double>();
		bNode.setData(303.303);
		doubleList.addNode(bNode);
		
		// Create stringList
		GenericLinkedList<String> stringList=new GenericLinkedList<String>();
		// Create nodes for stringList
		GenericNode<String> cNode=new GenericNode<String>();
		cNode.setData("A string.");
		stringList.addNode(cNode);
		cNode = new GenericNode<String>();
		cNode.setData("Another string.");
		stringList.addNode(cNode);
		cNode = new GenericNode<String>();
		cNode.setData("Last string.");
		stringList.addNode(cNode);
		
		// Print the data for each node of each list
		System.out.println("\nintegerList:");
		GenericNode<Integer> integerNode=integerList.getList();
		do 
		{
			System.out.println(integerNode.getData());
			integerNode=integerNode.getNextNode();
		} while (integerNode!=null);
		
		System.out.println("\ndoubleList:");
		GenericNode<Double> doubleNode=doubleList.getList();
		do 
		{
			System.out.println(doubleNode.getData());
			doubleNode=doubleNode.getNextNode();
		} while (doubleNode!=null);
		
		System.out.println("\nstringList:");
		GenericNode<String> stringNode=stringList.getList();
		do 
		{
			System.out.println(stringNode.getData());
			stringNode=stringNode.getNextNode();
		} while (stringNode!=null);

	}//end main

}//end class
