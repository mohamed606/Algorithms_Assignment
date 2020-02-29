package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD




||||||| 57e9d7c
	// write your code here
        Tree<Integer> tree=new Tree<>(5);
        tree.setLeft(new Tree<>(6));
        tree.setRight(new Tree<>(7));
        tree.getLeft().setLeft(new Tree<>(3));
        Integer [] arr =tree.largestValues(tree);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("number : "+arr[i]);
        }
=======

        Tree<Integer>tree = new Tree<>(1);
        tree.setLeft(new Tree<>(2));
        tree.setRight(new Tree<>(2));
        tree.getLeft().setLeft(new Tree<>(3));
        tree.getLeft().setRight(new Tree<>(4));
        tree.getRight().setLeft(new Tree<>(4));
        tree.getRight().setRight(new Tree<>(3));
//        Tree<Integer>tree = new Tree<>(1);
//        tree.setLeft(new Tree<>(2));
//        tree.setRight(new Tree<>(2));
//        tree.getLeft().setRight(new Tree<>(3));
//        tree.getLeft().setLeft(new Tree<>(3));
//        tree.getRight().setRight(new Tree<>(4));
//        tree.getRight().setLeft(new Tree<>(4));
//        Tree<Integer>tree = new Tree<>(1);
//        tree.setLeft(new Tree<>(2));
//        tree.setRight(new Tree<>(2));
//        tree.getLeft().setRight(new Tree<>(3));
//        tree.getRight().setRight(new Tree<>(3));
        System.out.println("isSymmetric "+tree.isSymmetric(tree));
        System.out.println("isSymmetricRec "+tree.isSymmetricRecurs(tree));
        System.out.println("treeSum "+tree.digitSum(tree));
>>>>>>> 628ee1b8cafd81801cde430df8b6ea334b13b332
    }

}