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

        int totalFuel = 0;
        for(Integer mass : masses){
            totalFuel += calculateFuel(mass);
        }
        return totalFuel;
    }

    public int countupMasses(List<Integer> masses){
        int totalmass = 0;
        for(Integer mass : masses){
            totalmass += mass;
        }
        return totalmass;
    }

    public int calculateFuel(Integer mass){
        //calculate fuel
        return((mass/3) -2);
    }

    public int calculateFuelIncFuelForFuel(List<Integer> masses){
        int totalFuel = 0;
        for(Integer mass : masses){
            //Calculate fuel
            int fuel =  calculateFuel(mass);
            //Calculate fuel for fuel
            int fuelForFuel = calcuatateFuelForFuel(fuel);
            //Add the two
            totalFuel += (fuel + fuelForFuel);
        }
        return totalFuel;
    }


    public int calcuatateFuelForFuel(Integer mass){
        int fuel = calculateFuel(mass);
        if(fuel>0){
            int extraFuel = calcuatateFuelForFuel(fuel);
            fuel+=extraFuel;
            return fuel;
        }else{
            return 0;
        }
    }

    public static void main(String[] args){
        FuelCalculator calc = new FuelCalculator();
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

        int originalFuel = calc.calculateFuel(massesAsList);
        int totalFuel = calc.calculateFuelIncFuelForFuel(massesAsList);

        System.out.println("Fuel: " +originalFuel); //NOSONAR
        System.out.println("Total Fuel: " + totalFuel); //NOSONAR


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
