package TaskOne;

/*
 * write a java program to display all the multiples of 2,3 and 7
 * within the range 71 to 150
 */


public class QuestionFour {
    public static void main(String args[]) {

			//multiples of 2
		System.out.println("\nMultiples of 2: ");	
		//multiples of 2 within the range of 71 and 150	
		for (int i=71; i<150; i++) {
			if (i%2==0) 
			System.out.print(i +", ");			
		}			
				//multiples of 3
		System.out.println("\n\nMultiples of 3: ");
		//multiples of 3 within the range of 71 and 150
		for (int i=71; i<150; i++) {
			if (i%3==0) System.out.print(i +", ");			
		}

			//multiples of 7	
		System.out.println("\n\nMultiles of  7: ");
		//multiples of 7 within the range of 71 and 150
        for(int i=71; i<150; i++)
            if (i%7==0) System.out.print(i +", ");			
		 }
        
        }
