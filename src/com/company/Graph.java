package com.company;

import java.util.*;

public class Graph {
    private int countryId;
    private boolean hasClub;
    private ArrayList<Graph> adjacents;
    public Graph(int countryId){
        this.countryId = countryId;
        adjacents = new ArrayList<>();
    }
    public void addAdjacent(Graph adjacent){
        adjacents.add(adjacent);
    }
    public ArrayList<Graph> getAdjacents() {
        return adjacents;
    }

    public void setAdjacents(ArrayList<Graph> adjacents) {
        this.adjacents = adjacents;
    }

    public int getCountryId() {
        return countryId;
    }

    public boolean isHasClub() {
        return hasClub;
    }

    public void setHasClub(boolean hasClub) {
        this.hasClub = hasClub;
    }

    public int shortestRoute (Graph rootVertex){
        int currentLevel =1;
        int nextLevel = rootVertex.getAdjacents().size();
        int calculateNextLevel = 0;
        int numberOfRemovedFromQueue = 0;
        ArrayList<Graph>countriesWithClub = new ArrayList<>();
        Queue<Graph>queue = new LinkedList<>();
        queue.add(rootVertex);
        while (!queue.isEmpty()){
            Graph vertex = queue.remove();
            numberOfRemovedFromQueue++;
            ArrayList<Graph> adjacents= vertex.getAdjacents();
            for(int i=0 ; i<adjacents.size();i++){
                Graph adjacent = adjacents.get(i);
                calculateNextLevel+=adjacent.getAdjacents().size();
                if(adjacent.isHasClub()){
                    countriesWithClub.add(adjacent);
                }
                queue.add(adjacent);
            }
            if(!countriesWithClub.isEmpty() && queue.size()==nextLevel && numberOfRemovedFromQueue==currentLevel){
                return (Collections.min(countriesWithClub, Comparator.comparingInt(Graph::getCountryId))).getCountryId();
            }
            if(numberOfRemovedFromQueue == currentLevel){
                currentLevel = nextLevel;
                nextLevel =calculateNextLevel;
                numberOfRemovedFromQueue = 0;
                calculateNextLevel=0;
            }
        }
        return -1;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Graph){
            Graph otherVertex = (Graph)obj;
            return otherVertex.getCountryId() == this.getCountryId();
        }
        return false;
    }
}
