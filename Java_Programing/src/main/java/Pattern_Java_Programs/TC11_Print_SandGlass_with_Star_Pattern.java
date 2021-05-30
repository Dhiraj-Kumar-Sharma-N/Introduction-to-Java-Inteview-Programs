package Pattern_Java_Programs;

public class TC11_Print_SandGlass_with_Star_Pattern {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" ");
			}
			for (int j = n; j >= i; j--) {

				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}

}

/*
 * ===================== OUTPUT ================================
 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 
 */
