package ie.tomlennon.aoc.day1;

import sun.reflect.annotation.ExceptionProxy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuelCalculator {


    public int calculateFuel(ArrayList<Integer> masses){
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
    public static void main(String args[]){
        BufferedReader reader;
        ArrayList massesAsList= new ArrayList<Integer>();
        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\repos\\github\\AdventOfCode\\2019\\src\\main\\java\\ie\\tomlennon\\aoc\\day1\\input.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
                try{
                    massesAsList.add(Integer.parseInt(line));
                }catch (Exception ex){
                        //do nothing
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fuel: " + new FuelCalculator().calculateFuel(massesAsList));

    }

}
