/**
 *   File Name: Snippet.java<br>
 *
 *   Venkatraman, Arunkumar<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 1, 2016
 *   
 */

package com.sqa.av.helpers;

/**
 * Snippet //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Venkatraman, Arunkumar
 * @version 1.0.0
 * @since 1.0
 *
 */
public class DisplayHelper {

	public static void multArray(Object[][] data) {

		// System.out.println(Arrays.deepToString(data));
		for (int i = 0; i < data.length; i++) {
			System.out.print("[");
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
				if (j < data[i].length - 1) {
					System.out.print("\t");
				}
			}
			System.out.println("]");
			System.out.println("\n");
		}
	}
}
