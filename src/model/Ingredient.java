package model;

import exceptions.NegativeWeightException;

public class Ingredient {

    private String name;
    private int weight;
    

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void addWeight (int weight) throws NegativeWeightException{

        if (weight < 0){
            throw new NegativeWeightException();
        }else {
            this.weight += weight;
        }
    }

    public void removeWeight (int weight){

        if (weight < 0){
            throw new NegativeWeightException();
        } else {
            this.weight -= weight;
        }
    }
}
