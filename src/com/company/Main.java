package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

//        Tree<Integer>tree = new Tree<>(1);
//        tree.setLeft(new Tree<>(2));
//        tree.setRight(new Tree<>(2));
//        tree.getLeft().setLeft(new Tree<>(3));
//        tree.getLeft().setRight(new Tree<>(4));
//        tree.getRight().setLeft(new Tree<>(4));
//        tree.getRight().setRight(new Tree<>(3));
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
//        System.out.println("isSymmetric "+tree.isSymmetric(tree));
//        System.out.println("isSymmetricRec "+tree.isSymmetricRecurs(tree));
        Tree<Integer>tree = new Tree<>(-1);
        tree.setLeft(new Tree<>(5));
        tree.setRight(new Tree<>(7));
        tree.getLeft().setLeft(new Tree<>(5));
        tree.getLeft().setRight(new Tree<>(20));
        tree.getRight().setRight(new Tree<>(1));
        tree.getRight().setLeft(new Tree<>(10));
        tree.getLeft().getLeft().setLeft(new Tree<>(100));
        Integer [] array = tree.largestValues(tree);
        for(int i : array){
            System.out.println(i);
        }

    }

}