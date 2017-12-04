package ie.tomlennon.day1;

public class Captcha {
    public static String calculateCaptcha(String sequence){
        int count = 0;
        int start= Integer.parseInt(sequence.substring(0, 1));
        int start1=Integer.parseInt(sequence.substring(1, 2));
        int end= Integer.parseInt(sequence.substring(sequence.length()-1, sequence.length()));
        int end1= Integer.parseInt(sequence.substring(sequence.length()-2, sequence.length()-1));

        //deal with first 2
        if(start==start1){
            count+=start;
        }
        //deal with end
        if(end==end1){
            count+=end;
        }
        if(start==end){
            count+=start;
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
}
