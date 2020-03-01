package com.company;

<<<<<<< HEAD
import java.util.*;
=======
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;

||||||| 57e9d7c
=======
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
>>>>>>> ce32f15cf56f38c70935dc3cd4be8bc7c72c2ce5

>>>>>>> 628ee1b8cafd81801cde430df8b6ea334b13b332
public class Tree<T> {
    private T value;
    private Tree<T> left;
    private Tree<T> right;

    public Tree(T value) {
        this.value = value;
    }

<<<<<<< HEAD
//    public Integer[] largestValues(Tree<Integer> root) {
//        int level = 0;
//        int removed = 0;
//        Queue<Tree<Integer>> queue = new LinkedList<>();
//        ArrayList<Integer> maximumValues = new ArrayList<>();
//        maximumValues.add(root.getValue());
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            Tree<Integer> node = queue.remove();
//            removed++;
//            if (node.getLeft() != null) {
//                queue.add(node.getLeft());
//            }
//            if (node.getRight() != null) {
//                queue.add(node.getRight());
//            }
//            if (removed == Math.pow(2, level)) {
//                level++;
//                removed = 0;
//                maximumValues.add(Collections.max(queue, new TreeComparator()).getValue());
//            }
//        }
//        return maximumValues.toArray(new Integer[0]);
//    }

=======
<<<<<<< HEAD
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
            getLevelNumbers(root,i,levelNumbers);
            maxNumbers.add(Collections.max(levelNumbers));
            levelNumbers.clear();
        }
        return maxNumbers;
    }
    public void getLevelNumbers(Tree<Integer> root, int level, ArrayList<Integer> numbersInLevel)
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
            getLevelNumbers(root.getLeft(),level-1,numbersInLevel);
            getLevelNumbers(root.getRight(),level-1,numbersInLevel);
        }

    }

||||||| 57e9d7c
=======
>>>>>>> ce32f15cf56f38c70935dc3cd4be8bc7c72c2ce5
    public boolean isSymmetric(Tree<Integer> root) {
        int treeLevel = 1;
        int removed = 0;
        ArrayList<Integer> check = new ArrayList<>();
        Queue<Tree<Integer>> queue = new LinkedList<>();
        if (root == null || (root.getLeft() == null && root.getRight() == null)) {
            return true;
        } else {
            queue.add(root.getLeft());
            queue.add(root.getRight());
            while (!queue.isEmpty()) {
                Tree<Integer> node = queue.remove();
                removed++;
                if (!node.getValue().equals(1001) && (node.getLeft() != null || node.getRight()!=null)) {
                    if (node.getLeft() != null) {
                        queue.add(node.getLeft());
                    } else {
                        queue.add(new Tree<>(1001));
                    }
                    if (node.getRight() != null) {
                        queue.add(node.getRight());
                    } else {
                        queue.add(new Tree<>(1001));
                    }
                }
                if (removed <= ((Math.pow(2, treeLevel)) / 2)) {
                    check.add(node.getValue());
                } else {
                    if (node.getValue().equals(check.get(check.size() - 1))) {
                        check.remove(check.size() - 1);
                    } else {
                        check.add(node.getValue());
                    }
                }
                if (removed == Math.pow(2, treeLevel)) {
                    removed = 0;
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
    public long digitSum(Tree<Integer>root)
    {
        return treeSum(root,0);
    }
    private long treeSum(Tree<Integer> node, int val)
    {

        if (node == null)
            return 0;


        val = (val * 10 + node.getValue());


        if (node.getLeft() == null && node.getRight() == null)
            return val;


        return treeSum(node.getLeft(), val)
                + treeSum(node.getRight(), val);
    }

>>>>>>> 628ee1b8cafd81801cde430df8b6ea334b13b332
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

