/*	1 
	12 
	123 
	1234*/

/*public class SquarePattern {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}*/
//4)

/*	1 
	22 
	333 
	4444 */

/*public class SquarePattern {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
}*/

//5)
/* 	1 **** 4 
 	2 *** 3
 	3 ** 2
 	4 * 1 */

/*public class SquarePattern {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}*/

//6)
/*	1234 
	123 
	12 
	1 */
/*public class SquarePattern {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n - i + 1; j++) {//
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}*/

//7)
/*	 *   (3,1,3)
	***  (2,3,2)
       ***** (1,5,1)
      ******* (0,7,0) */

/*public class SquarePattern {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		printPattern(n);
	}
 
	public static void printPattern(int n) {
		for (int i = 0; i < n; i++) {
			// space
			for (int j = 0; j < n - i + 1; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}

			// space
			for (int j = 0; j < n - i + 1; j++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}
}  */

//8)
/*	*********  (0,9,0)
	 *******   (1,7,1)
	  *****    (2,5,2)
	   ***     (3,3,3)
	    *  *///(4,1,4)

/*public class SquarePattern {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		printPattern(n);
	}
 
	public static void printPattern(int n) {
		for (int i = 0; i < n; i++) {
			// space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 0; j < 2*n-(2 * i + 1); j++) {
				System.out.print("*");
			}

			// space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}
} */

//9
/*  *   (3,1,3)
   ***  (2,3,2)
  ***** (1,5,1)
 *******
 *******
  *****
   ***
    *   */

 /*public class SquarePattern {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 0; i < n; i++) {
			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}

			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			// space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
				System.out.print("*");
			}

			// space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}

}*/


//10)
/*      *
	** 
	*** 
	**** 
	***** 
	**** 
	*** 
	** 
	*  */

public class Pattern {
	public static void main(String args[]) {
		//Scanner scr = new Scanner(System.in);
		//int n = scr.nextInt();
		printPattern(5);
		printPattern1(4);
	}

	public static void printPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	public static void printPattern1(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
