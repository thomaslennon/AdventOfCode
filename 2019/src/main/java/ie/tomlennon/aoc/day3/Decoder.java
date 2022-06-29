package ie.tomlennon.aoc.day3;

import java.util.logging.Logger;

public class Decoder {
    public static Direction getDirection(String code) {
        char direction = code.charAt(0);
        Direction direction1 = null;
        switch (direction) {
            case 'U':
                direction1 = Direction.UP;
                break;
            case 'D':
                direction1 = Direction.DOWN;
                break;
            case 'L':
                direction1 = Direction.LEFT;
                break;
            case 'R':
                direction1 = Direction.RIGHT;
                break;
            default:
                Logger.getAnonymousLogger().warning("No Direction supplied");
                break;

        }

        return direction1;
    }

    public static Integer numberOfSteps(String code) {
        int steps = 0;
        String stepsAsaStr = code.substring(1);
        steps = Integer.parseInt(stepsAsaStr);
        return steps;
    }
}
