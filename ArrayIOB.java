package Practice;

public class ArrayIOB{

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		try {
			for(int i=0;i<=arr.length;i++) {// here we have given equal to symbol so it getting exception
				System.out.println(arr[i]);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("try catch finished");
		}
		
	}

}
