public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  


	public static boolean isAnagram(String str1, String str2) {
		str1 = preProcess(str1);
		str2 = preProcess(str2);
		if (str1.length() == str2.length()){
			int len = str1.length();
			for (int i = 0; i < len; i++){
				boolean found = false;
				for (int n = 0; n < len; n++){
					if (str1.charAt(i) == str2.charAt(n)){
						found = true; 
						break;
					}
				}
			if (!found) {
				return false;
			}
			}
		}
		return true;
	}
	   

	public static String preProcess(String str) {
		String newStr = "";
		for (int i = 0 ; i < str.length(); i++){
			if (Character.isLetter(str.charAt(i))){
				if (Character.isUpperCase(str.charAt(i))){
					char n = Character.toLowerCase(str.charAt(i));
					newStr = newStr + n;
				}
				else {
					newStr = newStr + str.charAt(i);
				}
			}
		} 
		return newStr;
	}   

	public static String randomAnagram(String str) {
		String randomStr = "";
		while (str.length() > 0){
			int randomNum = (int) (Math.random() * str.length());
			randomStr = randomStr + str.charAt(randomNum);
			str = str.substring(0, randomNum) + str.substring(randomNum + 1);
		}
		return randomStr;
	}
}
