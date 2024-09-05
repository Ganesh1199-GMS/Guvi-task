package javaWDB2;

public class Assignment {

	public static void main(String[] args) {
		String city="noida";
				if (city=="mumbai") {System.out.println("city is mumbai");

	}else {System.out.println("it is not a mumbai");}
	
				
	// its a next method for to know
				
	int day=3; //always use (;) to end
	switch (day) //this should put in () bracket
	{
	case 1 :
		System.out.println("monday");
		break ;
	case 2:
		System.out.println("tuesday");
		break;											
	case 3:
		System.out.println("wednesday");
		break;
	case 4:
		System.out.println("thursday");
		break;
	default:
		System.out.println("good week");
	
	}
	int count=1;
	while (count<11)
	{System.out.println("count is "+ count);
	count++;
	}
	
	int count1 =1;
	do {System.out.println("count is "+ count1);
	count1++;}
	while (count1<11);
	}
}
