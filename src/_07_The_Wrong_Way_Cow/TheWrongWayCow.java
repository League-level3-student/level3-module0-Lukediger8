/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!
		int forward = 0;
		int backward = 0;
		int up = 0;
		int down = 0;
		int[] forwardArray = { -1, -1 };
		int[] backwardArray = { -1, -1 };
		int[] upArray = { -1, -1 };
		int[] downArray = { -1, -1 };

		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length - 2; j++) {
				if (field[i][j] == 'c') {
					if (field[i][j + 1] == 'o') {
						if (field[i][j + 2] == 'w') {
							forward++;
							forwardArray[0] = j;
							forwardArray[1] = i;
						}
					}
				}
			}
		}

		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length - 2; j++) {
				if (field[i][j] == 'w') {
					if (field[i][j + 1] == 'o') {
						if (field[i][j + 2] == 'c') {
							backward++;
							backwardArray[0] = j + 2;
							backwardArray[1] = i;

						}
					}
				}
			}
		}

		for (int i = 0; i < field[0].length; i++) {
			for (int j = 0; j < field.length - 2; j++) {
				if (field[j][i] == 'w') {
					if (field[j + 1][i] == 'o') {
						if (field[j + 2][i] == 'c') {
							up++;
							upArray[0] = i;
							upArray[1] = j + 2;

						}
					}
				}
			}
		}
		
		for (int i = 0; i < field[0].length; i++) {
			for (int j = 0; j < field.length - 2; j++) {
				if (field[j][i] == 'c') {
					if (field[j + 1][i] == 'o') {
						if (field[j + 2][i] == 'w') {
							down++;
							downArray[0] = i;
							downArray[1] = j;

						}
					}
				}
			}
		}
		if (forward == 1) {
			return forwardArray;

		}
		if (backward == 1) {
			return backwardArray;
		}
		if (up == 1) {
			return upArray;
		}
		if(down == 1) {
		return downArray;
		}
		return upArray;
	}
}
