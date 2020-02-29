package com.company;

public class Main {

    public static void main(String[] args) {

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
    }

}