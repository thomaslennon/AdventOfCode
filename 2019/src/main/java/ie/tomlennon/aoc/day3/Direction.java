package ie.tomlennon.aoc.day3;


import java.util.logging.Logger;

public enum Direction {
    RIGHT,
    LEFT,
    UP,
    DOWN;

    public char getCode(){
        return this.toString().charAt(0);
    }



}
