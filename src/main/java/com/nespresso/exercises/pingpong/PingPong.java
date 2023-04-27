package com.nespresso.exercises.pingpong;

public class PingPong {

    int matches;
    public static final String METRES="..";
    Player firstPlayer=new Player("I");
    Player secondPlayer=new Player("O");

    public PingPong(int matches) {
        this.matches=matches;
    }

    public String findResult(){
        String result="";
        int count=0;
        String table="";
        while(count<matches){
            result+="I"+table+"O";
            count++;
            table+="..";
        }
        return result;

    }
    public String print() {
        return findResult();
    }
}
