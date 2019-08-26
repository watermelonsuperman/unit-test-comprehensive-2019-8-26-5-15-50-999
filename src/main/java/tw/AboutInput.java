package tw;

public class AboutInput {
	public static int[] seperateInput(String input){
    	int[] result = new int[4];
    	
    	result[0] = Integer.valueOf(input.charAt(0)+"");
    	result[1] = Integer.valueOf(input.charAt(2)+"");
    	result[2] = Integer.valueOf(input.charAt(4)+"");
    	result[3] = Integer.valueOf(input.charAt(6)+"");
    	for(int i = 0;i<result.length;i++){
        	System.out.print(result[i]+" ");
        }
    	return result;
    }

}
