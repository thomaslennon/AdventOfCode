package ie.tomlennon.aoc.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuelCalculator {

    public int calculateFuel(List<Integer> masses){
        //sum all the masses
        int totalFuel = 0;
        for(Integer mass : masses){
            totalFuel += calculateFuel(mass);
        }
        return totalFuel;
    }

    public int calculateFuel(Integer mass){
        //calculate fuel
        return((mass/3) -2);
    }

    public static void main(String[] args){
        //Right answer is 3455717
        List massesAsList= new ArrayList<Integer>();
        try (BufferedReader reader = new BufferedReader(new FileReader(
                "C:\\repos\\github\\AdventOfCode\\2019\\src\\main\\java\\ie\\tomlennon\\aoc\\day1\\input.txt")))
        {
            String line = reader.readLine();
            while (line != null) {
                massesAsList.add(convertStringToInteger(line));
                // read next line
                line = reader.readLine();
            }

        } catch (IOException ioe) {
            Logger.getAnonymousLogger().log(Level.WARNING, "IOException throwns in parsing file", ioe);
        }

        System.out.println("Fuel: " + new FuelCalculator().calculateFuel(massesAsList)); //NOSONAR

    }

    private static Integer convertStringToInteger(String line){
        try{
            return Integer.parseInt(line);
        }catch (Exception ex){
            //do nothing
        }
        return 0;
    }

}
