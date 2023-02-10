package ExceptionHandlingDemo;

public class exceptionhandlingdemo {

	public static void main(String[] args) {
		try {
			System.out.println("Before exception");
			int a = 1/0;
			System.out.println("After exception");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			
		}

	}

}
