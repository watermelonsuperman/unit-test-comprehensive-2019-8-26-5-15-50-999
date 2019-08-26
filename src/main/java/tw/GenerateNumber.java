package tw;

import java.util.Random;

public class GenerateNumber {
	   //自动生成四个数且不重复
    public static int[] generateNumber(){
    	int[] number = new int[4]; 
    	number[0] = new Random().nextInt(9);
    	number[1] = new Random().nextInt(9);
    	while(number[0] == number[1]){
    		number[1] = new Random().nextInt(9);
    	}
    	number[2] = new Random().nextInt(9);
    	while(number[0] == number[2] || number[1] == number[2]){
    		number[2] = new Random().nextInt(9);
    	}
    	number[3] = new Random().nextInt(9);
    	while(number[0] == number[3] || number[1] == number[3] || number[2] == number[3]){
    		number[3] = new Random().nextInt(9);
    	}
    	return number;
    	
    }

}
