package ie.tomlennon.day1;

public class Captcha {
    public static String calculateCaptcha1stExercise(String sequence){
        int count = 0;
        int first= Integer.parseInt(sequence.substring(0, 1));
        int second=Integer.parseInt(sequence.substring(1, 2));
        int last= Integer.parseInt(sequence.substring(sequence.length()-1, sequence.length()));
        int secondLast= Integer.parseInt(sequence.substring(sequence.length()-2, sequence.length()-1));

        //deal with first 2
        if(first==second){
            count+=first;
        }
        //deal with end
        if(last==secondLast){
            count+=last;
        }
        if(first==last){
            count+=first;
        }

        int previousNumber=0;
        for(int index =1; index<(sequence.length()-1); index++){
            int current = Integer.parseInt(sequence.substring(index, index+1));
            if(previousNumber==current){
                count+=current;
            }
            previousNumber=current;
        }

        return Integer.toString(count);

    }

    public static String calculateCaptcha2ndExercise(String sequence){
        int count=0;

        return Integer.toString(count);
    }

}
