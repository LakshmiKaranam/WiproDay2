
package Practice;

public class NullPointExcept {

	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println("String length: "+str.length());


		}
		catch(Exception e) {
			System.out.println("Can't read the String length because this string is null ");
		}
		finally{
			System.out.println("final block alway executed");
		}
	}

}
