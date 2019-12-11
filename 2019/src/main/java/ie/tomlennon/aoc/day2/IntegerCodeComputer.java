package ie.tomlennon.aoc.day2;

import java.util.List;
import java.util.logging.Logger;

public class IntegerCodeComputer {
    public static final int ADDITION_OPT_CODE = 1;
    public static final int MULTIPLICATION_OPT_CODE = 2;

    public List<Integer> calculate(List<Integer> code){

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

}
