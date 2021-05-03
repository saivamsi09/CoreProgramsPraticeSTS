/**
 * 
 */

/**
 * @author lenovo
 *
 */
public class StringManupulationsJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string= "vamsi";
		System.out.println(reverseaString(string));

	}
	
	public static StringBuffer reverseaString(String str) {
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(str);
		sBuffer.reverse();
		
		
		return sBuffer;
		
		
	}

}
