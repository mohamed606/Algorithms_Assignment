package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Tree<T> {
    private T value;
    private Tree<T> left;
    private Tree<T> right;
    public Tree(T value){
        this.value = value;
    }

    public Integer [] largestValues(Tree<Integer> t)
    {
        ArrayList<Integer> arrayList = getLevelMaxNumber(t);
        return arrayList.toArray(new Integer[0]);
    }
    public int getHeight(Tree<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftHeight=getHeight(root.getLeft());
        int rightHeight=getHeight(root.getRight());
        if (leftHeight>rightHeight)
        {
            return leftHeight+1;
        }
        else
        {
            return rightHeight+1;
        }
    }
    public ArrayList<Integer> getLevelMaxNumber(Tree<Integer>root)
    {
        int height=getHeight(root);
        int max=0;
        ArrayList<Integer>levelNumbers=new ArrayList<>();
        ArrayList<Integer> maxNumbers= new ArrayList<>();

        System.out.println("height " +height);
        for(int i=1;i<=height;i++)
        {
            printGivenLevel(root,i,levelNumbers);
            maxNumbers.add(Collections.max(levelNumbers));
            levelNumbers.clear();
        }
        return maxNumbers;
    }
    public void printGivenLevel(Tree<Integer> root, int level, ArrayList<Integer> numbersInLevel)
    {
        if(root==null)
        {
            return ;
        }
        if(level==1)
        {
            numbersInLevel.add(root.getValue());
        }
        else if (level>1)
        {
            printGivenLevel(root.getLeft(),level-1,numbersInLevel);
            printGivenLevel(root.getRight(),level-1,numbersInLevel);
        }

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
