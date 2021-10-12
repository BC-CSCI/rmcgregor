import java.util.Scanner;

class Lab6b {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		while(true) {

			System.out.println("[1] count digits");
			System.out.println("[2] contains \"cat\"");
			System.out.println("[3] count instances of substring");
			System.out.println("[4] exit");

			System.out.println("choose an option");
			int option = kb.nextInt();
			kb.skip("\\R");

			switch(option){
				case 1:
					System.out.println("enter string");
					String str = kb.nextLine();

					int numDigits = countDigits(str);
					System.out.println("Number of digits: " + numDigits);
					break;
				case 2:
					System.out.println("enter string");
					String str2 = kb.nextLine();

					boolean hasCat = containsCat(str2);
					System.out.println("Contains cat: " + hasCat);
					break;
				case 3:
					System.out.println("enter string");
					String str3 = kb.nextLine();

					System.out.println("enter string");
					String str4 = kb.nextLine();

					int numInstances = substringCount(str3, str4);
					System.out.println("Number of instances: " + numInstances);
					break;
				case 4:
					return;
			}
		
		}
	}

	static int countDigits(String s) {
		int len = s.length();

		int counter = 0;
		for(int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				counter++;
			}
		}
		return counter;
	}

	static boolean containsCat(String s) {
		int len = s.length();

		for(int i = 0; i <= len - 3; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			char c3 = s.charAt(i+2);

			if(c1 == 'c' && c2 == 'a' && c3 == 't'){
				return true;
			}
		}		
		return false;
	}

	static int substringCount(String s, String t) {
		int sLen = s.length();
		int tLen = t.length();
		
		int count = 0;

		for(int i = 0; i <= sLen - tLen; i++) {
			
			for(int j = 0; j < tLen; j++) {
				
				char sChar = s.charAt(i+j);	
				char tChar = t.charAt(j);
		
				if(sChar != tChar) {
					break;
				}		
				if(j == tLen -1) {
					count++;
				}
			}
		}
		return count;	
	}


}






// end of file
