package ie.tomlennon.aoc.day2;

import ie.tomlennon.aoc.Utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/**
 * Solution to part 1 was 5290681
 */

public class IntegerCodeComputer {
    public static final int ADDITION_OPT_CODE = 1;
    public static final int MULTIPLICATION_OPT_CODE = 2;

    public static List<Integer> calculate(List<Integer> code) {

        int index = 0;
        //Process the list 4 at a time.
        for (index = 0; index < code.size(); index += 4) {
            int operator = code.get(index);
            if (operator == 99) {
                break;
            }
            int positionOfFirstField = code.get(index + 1);
            int firstValue = code.get(positionOfFirstField);
            int positionOfSecondValue = code.get(index + 2);
            int secondValue = code.get(positionOfSecondValue);
            int positionOfResult = code.get(index + 3);
            code.remove(positionOfResult);
            switch (operator) {
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


    public static void main(String[] args) {
        //Read the file
        Collection<String> fileContents = Utilities.readInputFile("C:\\repos\\github\\AdventOfCode\\2019\\src\\main\\java\\ie\\tomlennon\\aoc\\day2\\input.txt");
        List<Integer> code = Utilities.getCodesAsIntegers(fileContents);

        List<Integer> part1Code = new ArrayList(code);
        List<Integer> part2Code = new ArrayList(code);

        part1Code.remove(1);
        part1Code.add(1, 12);
        part1Code.remove(2);
        part1Code.add(2, 2);

        IntegerCodeComputer.calculate(part1Code);
        IntegerCodeComputer.findRightInputs(part2Code);

        fileContents.size();

        Logger.getAnonymousLogger().warning("Ans " + (100 * 12 + 2));
    }

    public static void findRightInputs(List<Integer> code) {
        final int VALUETOFIND = 19690720;

        List<Integer> localCopy = new ArrayList<>(code);

        for (int firstOpertor = 0; firstOpertor < 100; firstOpertor++) {
            for (int secondOperator = 0; secondOperator < 100; secondOperator++) {
                localCopy.remove(1);
                localCopy.add(1, firstOpertor);
                localCopy.remove(2); //NOSONAR - eeitlen, it's used correctly for this program
                localCopy.add(2, secondOperator);
                IntegerCodeComputer.calculate(localCopy);
                int result = localCopy.get(0);
                if (result == VALUETOFIND) {
                    String message = "Result:" + result + " 1st " + firstOpertor + " 2nd " + secondOperator;
                    Logger.getAnonymousLogger().warning(message);
                    message = "Ans " + (100 * firstOpertor + secondOperator);
                    Logger.getAnonymousLogger().warning(message);
                }

                //Reset
                localCopy = new ArrayList<>(code);
            }
        }

    }

}
