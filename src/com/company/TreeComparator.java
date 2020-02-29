package com.company;

import java.util.Comparator;

public class TreeComparator implements Comparator<Tree<Integer>> {
    @Override
    public int compare(Tree<Integer> o1, Tree<Integer> o2) {
        return o1.getValue()-o2.getValue();
    }
}
