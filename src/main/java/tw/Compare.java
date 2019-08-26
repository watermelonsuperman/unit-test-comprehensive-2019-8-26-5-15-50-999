package tw;

public class Compare {
    //输入的数组和答案数组进行比较
    public static String compare(int[] answer,int[] guessInput){
    	int aNumber = 0;
    	int bNumber = 0;
    	for(int i = 0;i<answer.length;i++){
    		if(answer[i] == guessInput[i])
    			aNumber++;
    	}
    	for(int i = 0;i<answer.length;i++){
    		for(int j = 0;j<guessInput.length;j++){
    			if(answer[i] == guessInput[j])
    				bNumber++;
    		}
    	}
    	return aNumber+"A"+bNumber+"B";
    }

}
