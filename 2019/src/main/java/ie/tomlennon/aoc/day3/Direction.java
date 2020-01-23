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

    public Direction convertChar(char character){
        if (character == 'R') {
            return RIGHT;
        }else if (character=='L'){
            return LEFT;
        }else if (character == 'U'){
            return DOWN;
        }else
            return DOWN;
    }



}
