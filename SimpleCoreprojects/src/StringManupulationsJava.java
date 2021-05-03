import java.util.HashMap;
import java.util.Map;

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
		String string= "vamsivamsi";
		findDuplicates(string);
		System.out.println(reverseaString(string));

	}
	
	public static StringBuffer reverseaString(String str) {
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(str);
		sBuffer.reverse();
		return sBuffer;
		
		
	}
	public static void findDuplicates(String str) {
		 HashMap<Character, Integer> count = new HashMap<>();
	        /*Store duplicates present
	        in the passed string */
	        for (int i = 0; i < str.length(); i++) {
	            if (!count.containsKey(str.charAt(i)))
	                count.put(str.charAt(i), 1);
	            else
	                count.put(str.charAt(i),
	                          count.get(str.charAt(i)) + 1);
	        }
	 
	        /*Print duplicates in sorted order*/
	        System.out.println(count);
	        for (Map.Entry mapElement : count.entrySet()) {
	            char key = (char)mapElement.getKey();
	            int value = ((int)mapElement.getValue());
	 
	            if (value > 1)
	                System.out.println(key
	                                   + ", count = " + value);
	        }
		
		
		
	}

}
