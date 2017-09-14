package com.example.myadapterlist;


public class State {
    private String name;
    private String capital;
    private int flagResource;

    public State(String name, String capital, int flag){

        this.name = name;
        this.capital = capital;
        this.flagResource = flag;

    }

    public String getName() {
        return this.name;

    }

    public String getCapital(){
        return this.capital;

    }

    public void setCapital(String capital) {
        this.capital = capital;

    }

    public int getFlagResource(){
        return this.flagResource;
    }

    public void setFlagResource(int flagResource){
        this.flagResource = flagResource;

    }
}
