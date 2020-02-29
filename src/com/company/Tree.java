package com.company;

public class Tree<T> {
    private T value;
    private Tree<T> left;
    private Tree<T> right;
    public Tree(T value){
        this.value = value;
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
