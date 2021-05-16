package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> mylist = new ArrayList<String>();
	//	ArrayList<Integer> intlist = new ArrayList<Integer>();
		
		mylist.add("Adam");
		mylist.add("Ryaan");
		mylist.add("Sachin");
		mylist.add("Amaira");
		
		
		
		System.out.println("Before Sorting ");
		//intlist.add(2);
		//intlist.add(34);
		System.out.println(mylist);
		//System.out.println(intlist);
		
		//Collections.sort(mylist);
		Collections.sort(mylist);
		System.out.println("After Sorting");
		
		System.out.println(mylist);
		Collections.sort(mylist,Collections.reverseOrder());
		System.out.println("In Descending order");
		System.out.println(mylist);
		
		
		Stack<String> mystack = new Stack<String>();
		
		mystack.push("abc");
		mystack.push("pqr");
		mystack.pop();
		mystack.push("opq");
		mystack.push("89");
		System.out.println(mystack);
	}

	//private static void sort(ArrayList<String> mylist) {
		// TODO Auto-generated method stub
		
	}


