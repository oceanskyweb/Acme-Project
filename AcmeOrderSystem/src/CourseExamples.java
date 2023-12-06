public class CourseExamples 
{
	public static void main(String[] args)
	{
		boolean inMinneapolis = false;
		boolean inStPaul = false;
		
		if(inMinneapolis)
		{
			System.out.println("Hello from Mpls!");
		} else if(inStPaul){
			System.out.println("Hello from Saint Paul");
		} else {
			System.out.println("Hellp from somwewhere");
			System.out.println("... can we visit you in St. Paul");
		}
		
		//Switch Statement with an int
		int j = 2;
		String str = null;
		
		switch(j) {
			case 1:
				str = "one";
				break;
			case 2:
				str = "two";

			case 3:
				str = "three";
				break;
			case 4:
				str = "four";
				break;
			default:
				str = "Unknown";
		}
		System.out.println(str);
		
		
		//Switch Statement with an int
		char c = 'A';
		
		switch(c) {
			case 'A':
				str = "one";
				break;
			default:
				str = "Unknown char";
		}
		System.out.println(str);
		
		
		//Switch Statement with a String
		String timeOfDay = "a.m.";
		
		switch(timeOfDay) {
			case "a.m.":
				System.out.println("good morning");
				break;
			case "p.m.":
				System.out.println("good afternoon");
			default:
				str = "Good day";
		}
		System.out.println(str);
		
		
		//Switch Statement with an int
		int even = 2;
		
		switch(even) {
			case 1:
			case 3:
				str = "one";
				break;
			case 5:
				str = "four";
				break;
			default:
				str = "Even number";
		}
		System.out.println(str);
		
		
	}
}
