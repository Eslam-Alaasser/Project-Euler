

/*
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^ 1000?
 */
public class Problem16 {
	
	public static void SolveProblem() {
		System.out.println(DigitsSum(pow(2, 1000)));
	}
	
	public static String pow(int x, int y) {
		if (y == 1) {
			return "2";
		}else {
			return multiply(pow(x, y-1),x);
		}
	} 
	public static String multiply(String v1, int x) {
		String mul = "";
		int val =0;
		int d = 0;
		for(int c = v1.length()-1 ;c>=0;c--) {
			val = (int)(v1.charAt(c)-'0')*x+d;
			if (val > 9) {
				val -= 10;
				d = 1;
			}else {
				d = 0;
			}
			mul = String.valueOf(val)+mul;
			val = 0;
		}
		if (d ==1) {
			return String.valueOf(d)+mul;
		}
		
		return mul;
	}
	public static int DigitsSum(String val) {
		int sum = 0;
		for(int c = val.length()-1 ;c>=0;c--) {
			sum += (int)(val.charAt(c)-'0');
		
	}
	return sum;
	}

}
	
