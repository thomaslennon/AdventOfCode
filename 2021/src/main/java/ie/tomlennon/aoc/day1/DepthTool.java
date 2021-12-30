package ie.tomlennon.aoc.day1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DepthTool {

    private DepthTool(){
	}

	public static int countIncreases(List<Integer> depths) {
		int count = 0;
		int previousValue = 0;
		for(Integer depth : depths){
			if (previousValue>0&&depth>previousValue){
				count++;
			}
			previousValue = depth;
		}
		return count;
	}

	public static int countIncreasesSlidingWindow(List<Integer> depths){
		return 0;
	}

	public static void main(String[] args){
		List<Integer> massesAsList= new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(
				"C:\\repos\\github\\AdventOfCode\\2021\\src\\main\\java\\ie\\tomlennon\\aoc\\day1\\Input.txt"))) {
			String line = reader.readLine();
			while (line != null) {
				massesAsList.add(convertStringToInteger(line));
				// read next line
				line = reader.readLine();
			}

		} catch (IOException ioe) {
			Logger.getAnonymousLogger().log(Level.WARNING, "IOException throwns in parsing file", ioe);
		}
		int countIncreases = DepthTool.countIncreases(massesAsList);

		System.out.println("count: " + countIncreases); //NOSONAR


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
