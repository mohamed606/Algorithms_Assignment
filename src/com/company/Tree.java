package com.company;

import java.util.*;

public class Tree<T>{
    private T value;
    private Tree<T> left;
    private Tree<T> right;

    public Tree(T value) {
        this.value = value;
    }

    public Integer [] largestValues(Tree<Integer>root){
        int level = 0;
        int removed = 0;
        Queue<Tree<Integer>>queue = new LinkedList<>();
        ArrayList<Integer> maximumValues = new ArrayList<>();
        maximumValues.add(root.getValue());
        queue.add(root);
        while (!queue.isEmpty()){
            Tree<Integer>node = queue.remove();
            removed++;
            if(node.getLeft() != null){
                queue.add(node.getLeft());
            }
            if(node.getRight() != null){
                queue.add(node.getRight());
            }
            if(removed == Math.pow(2,level)){
                level++;
                removed=0;
                maximumValues.add(Collections.max(queue,new TreeComparator()).getValue());
            }
        }
        return maximumValues.toArray(new Integer[0]);
    }

    public boolean isSymmetric(Tree<Integer> root) {
        int treeLevel=1;
        int removed=0;
        ArrayList<Integer>check = new ArrayList<>();
        Queue<Tree<Integer>> queue = new LinkedList<>();
        if(root == null || (root.getLeft()==null && root.getRight()==null)){
            return true;
        }else {
            queue.add(root.getLeft());
            queue.add(root.getRight());
            while (!queue.isEmpty()){
                Tree<Integer>node = queue.remove();
                removed++;
                if(node != null){
                    queue.add(node.getLeft());
                    queue.add(node.getRight());
                }
                if(check.isEmpty() || (check.size()< ((Math.pow(2,treeLevel))/2)&&removed<=((Math.pow(2,treeLevel))/2)) ){
                    if(node != null){
                        check.add(node.getValue());
                    }else {
                        check.add(1001);
                    }
                }else {
                    int nodeValue = 1001;
                    if(node != null && node.getValue().equals(check.get(check.size() - 1))){
                        check.remove(check.size()-1);
                    }else if(node == null && check.get(check.size()-1).equals(nodeValue)) {
                        check.remove(check.size()-1);
                    }else {
                        if(node == null){
                            check.add(nodeValue);
                        }else {
                            check.add(node.getValue());
                        }
                    }
                }
                if(removed == Math.pow(2,treeLevel)){
                    removed=0;
                    treeLevel++;
                }
            }
            return check.isEmpty();
        }
    }

    public boolean isSymmetricRecurs(Tree<Integer> root) {
        return isSymmetricRecursy(root.getLeft(), root.getRight());
    }

    private boolean isSymmetricRecursy(Tree<Integer> left, Tree<Integer> right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null && left.getValue().equals(right.getValue())) {
            return isSymmetricRecursy(left.getLeft(), right.getRight()) && isSymmetricRecursy(left.getRight(), right.getLeft());
        }
        return false;
    }

    public T getValue() {
        return value;
    }

    public Tree<T> getLeft() {
        return left;
    }

    public void setLeft(Tree<T> left) {
        this.left = left;
    }

    public Tree<T> getRight() {
        return right;
    }

    public void setRight(Tree<T> right) {
        this.right = right;
    }

}

