import org.junit.Test;

/*
 * Given a String and a Character, remove all instances of the Character in the String

Solve this two ways:
1. Iterate through the String, one character at a time<br>
2. Find a method in the String class that can solve this in one line
 */
public class StringProblemMain {

	
	
	public static void main(String[] args) {
		System.out.println(removeCharByFunction("String String Problem", "r"));
		System.out.println(removeCharByItr("String String Problem", 'r'));
	}
	//Method1: Iteration through String and removing character.
	public static String removeCharByItr(String str, char ch ){
		char[] cArray = str.toCharArray();
		StringBuilder newStr = new StringBuilder();
		for(int i =0; i< str.length(); i++){
			if(cArray[i] != ch){
				newStr.append(cArray[i]);
			}
		}
		str = newStr.toString();
		return str;
		
	}
	
	//Method2: Using String Replace Function to remove Character in a string
	public static String removeCharByFunction(String str, String ch ){
		str = str.replace(ch, "");
		return str;
		
	}

	
	
}
