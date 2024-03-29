package ie.tomlennon.aoc.day3;

import ie.tomlennon.aoc.Utilities;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class ManhattenDistanceCalculator {

    public static void main(String[] args) {
        //load the file
        Collection<String> file = Utilities.readInputFile("C:\\repos\\github\\AdventOfCode\\2019\\src\\main\\java\\ie\\tomlennon\\aoc\\day3\\inputD3.txt");
        List<String> directions = Utilities.getCodesAsStrings(file);
        Logger.getAnonymousLogger().warning(directions.toString());


    }

    public Integer calculate(List<String> code1, List<String> code2) {

        for (String code : code1) {
            //get the
            Direction direction = Decoder.getDirection(code);
            int steps = Decoder.numberOfSteps(code);
            Logger.getAnonymousLogger().warning(direction.toString() +" "+ steps);
        }

        for (String code : code2) {
            //get the
            Direction direction = Decoder.getDirection(code);
            int steps = Decoder.numberOfSteps(code);
            Logger.getAnonymousLogger().warning(direction.toString() +" "+ steps);
        }


        return 6;
    }



}
