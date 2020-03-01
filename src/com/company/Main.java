package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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
//        tree.getRight().setLeft(new Tree<>(3));
//        System.out.println("isSymmetric "+tree.isSymmetric(tree));
//        System.out.println("isSymmetricRec "+tree.isSymmetricRecurs(tree));







//        Tree<Integer>tree = new Tree<>(-1);
//        tree.setLeft(new Tree<>(5));
//        tree.setRight(new Tree<>(7));
//        tree.getLeft().setLeft(new Tree<>(5));
//        tree.getLeft().setRight(new Tree<>(20));
//        tree.getRight().setRight(new Tree<>(1));
//        tree.getRight().setLeft(new Tree<>(10));
//        tree.getLeft().getLeft().setLeft(new Tree<>(100));
//        Integer [] array = tree.largestValues(tree);
//        for(int i : array){
//            System.out.println(i);
//        }


        Graph root = new Graph(1);
        ArrayList<Graph>temp = new ArrayList<>();
        temp.add(root);
        Scanner input = new Scanner(System.in);
        Scanner enterPoints = new Scanner(System.in);
        int numberOfCountries = input.nextInt();
        for(int i=0 ; i<numberOfCountries-1 ;i++){
            int inputU = enterPoints.nextInt();
            int inputV = enterPoints.nextInt();
            int indexU = temp.indexOf(new Graph(inputU));
            int indexV = temp.indexOf(new Graph(inputV));
            if(indexU != -1){
                if(indexV != -1 ){
                    temp.get(indexU).addAdjacent(temp.get(indexV));
                }else {
                    temp.add(new Graph(inputV));
                    temp.get(indexU).addAdjacent(temp.get(temp.size()-1));
                }
            }else {
                temp.add(new Graph(inputU));
                if(indexV != -1 ){
                    temp.get(temp.size()-1).addAdjacent(temp.get(indexV));
                }else {
                    temp.add(new Graph(inputV));
                    temp.get(temp.size()-2).addAdjacent(temp.get(temp.size()-1));
                }
            }
        }
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for(int i=0 ; i<number ; i++){
            int ind = in.nextInt();
            int index = temp.indexOf(new Graph(ind));
            temp.get(index).setHasClub(true);
        }
        System.out.println(root.shortestRoute(root));
    }

}