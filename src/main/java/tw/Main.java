package tw;

import java.util.Random;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static  int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
    	AboutInput aboutInput = new AboutInput(); 
    	GenerateNumber randomNumber = new GenerateNumber();
    	Compare compare = new Compare();
    	
    	
    	int[] answer = randomNumber.generateNumber();
        
    	for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            int[] guessInput = aboutInput.seperateInput(input);
            
            
            String compareResult = compare.compare(answer,guessInput);
            
            System.out.println(compareResult);
            if(compareResult.equals("4A4B")){
            	break;
            }
        }
        for(int i = 0;i<answer.length;i++){
        	System.out.print(answer[i]+" ");
        }

    }

 

}
