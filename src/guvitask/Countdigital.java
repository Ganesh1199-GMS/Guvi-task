package guvitask;

public class Countdigital {

	public static void main(String[] args) {
		
		        int number = 123456789;  // Example number
		        int length = getIntegerLength(number);
		        System.out.println("Number of digits: " + length);
		    }

		    public static int getIntegerLength(int number) {
		        if (number == 0) return 1;  // Edge case for zero

		        int count = 0;
		        int num = Math.abs(number);
		        while (num > 0) {
		            num /= 10;
		            count++;
		        }
		        return count;
		    }
		

		    }
		


	


