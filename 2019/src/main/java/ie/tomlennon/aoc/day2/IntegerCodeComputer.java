package ie.tomlennon.aoc.day2;

import ie.tomlennon.aoc.Utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Logger;

/**
 * Solution to part 1 was 5290681
 */

public class IntegerCodeComputer {
    public static final int ADDITION_OPT_CODE = 1;
    public static final int MULTIPLICATION_OPT_CODE = 2;

    public static List<Integer> calculate(List<Integer> code){

        int index = 0;
        //Process the list 4 at a time.
        for(index =0; index < code.size(); index +=4){
            int operator = code.get(index);
            if(operator == 99){
                break;
            }
            int positionOfFirstField = code.get(index+1);
            int firstValue = code.get(positionOfFirstField);
            int positionOfSecondValue= code.get(index+2);
            int secondValue = code.get(positionOfSecondValue);
            int positionOfResult = code.get(index+3);
            code.remove(positionOfResult);
            switch(operator){
                case ADDITION_OPT_CODE:
                    code.add(positionOfResult, (firstValue + secondValue));
                    break;
                case MULTIPLICATION_OPT_CODE:
                    code.add(positionOfResult, firstValue * secondValue);
                    break;
                default:
                    Logger.getAnonymousLogger().warning("Shouldn't have got here!");
            }


        }
        return code;
    }


    public static void main(String[] args){
        //Read the file
        Collection<String> fileContents = Utilities.readInputFile("C:\\repos\\github\\AdventOfCode\\2019\\src\\main\\java\\ie\\tomlennon\\aoc\\day2\\input.txt");
        List<Integer> code = new ArrayList<>();
        for(String fileLine : fileContents){
            StringTokenizer tokenizer = new StringTokenizer(fileLine, ",");
            while(tokenizer.hasMoreTokens()){
                code.add(Integer.parseInt(tokenizer.nextToken()));
            }
        }

        IntegerCodeComputer.calculate(code);
        fileContents.size();



    }
}
