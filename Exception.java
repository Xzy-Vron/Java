import java.util.Scanner;
public class ExceptionHandling {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the exception to see the caught exception:");
		String exceptionType = sc.next();  

	    try {    
	    	switch (exceptionType) {
	        	case "ArithmeticException":
	        		int result = 10 / 0;  
	                break;
	                
	            case "ArrayIndexOutOfBoundsException":
	            	int[] arr = new int[5];
	                arr[10] = 100;  
	                break;
	                
	            case "NullPointerException":
	                String str = null;
	                str.length();  
	                break;
	                
	            case "ClassCastException":
	                Object obj = "String";
	                Integer num = (Integer) obj;  
	                break;

	            case "NumberFormatException":
	                String input = "abc";
	                int numParsed = Integer.parseInt(input);
	                break;

	            default:
	                System.out.println("No exception simulation for this type.");
	            }
	        } catch (Exception e) {
	        	e.printStackTrace();
	            System.out.println(e.getMessage());
	        }
	    }
}