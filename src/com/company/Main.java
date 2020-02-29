package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

	Tree<Integer> tree=new Tree<>(5);
	tree.setLeft(new Tree<>(6));
	tree.setRight(new Tree<>(7));
	tree.getLeft().setLeft(new Tree<>(3));
		Integer [] arr =tree.largestValues(tree);
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("number : "+arr[i]);
		}


    }

}
