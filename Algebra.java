public class Algebra {
	public static void main(String args[]) {
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4 
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		for (int i = 0 ; i < x1 ; i ++){
			x2 ++;
		}
		return x2;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		for (int i = 0 ; i < x2 ; i ++){
			x1 --;
		}
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int multi = 0;
		for (int i = 0 ; i <= x2 ; i ++){
			multi = plus(multi, x1);
		}
		multi = minus(multi, x1);
		return multi;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int pow = 1;
		if (n >= 0) {
			for (int i = 0 ; i < n ; i++){
			pow = times(pow, x);
		}
		}
		return pow;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int div = 0;
		while (x1 >= 0) {
			x1 = minus(x1, x2);
			div ++;
		} 
		div = minus(div, 1);
		return div;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int mod = minus(x1, times(x2, div(x1, x2)));
		return mod;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int a = 0;
		while (times(a, a) <= x){
			a++;
		}
		a = minus(a, 1);
		return a;
	}	  	  
}