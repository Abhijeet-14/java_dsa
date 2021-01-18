package _java._5BACKTRACKING;

public class _1_Backtracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		int n = str.length();

		System.out.println("Backtracking Approach");

		permute(str, 0, n - 1);
	}

	private static boolean isSafe(String str, int l, int i, int r) {

		// if previous char was 'A' & current char is 'B', then
		// do not proceed and CUT DOWN the recursion tree
		if (l != 0 && str.charAt(l - 1) == 'A' && str.charAt(i) == 'B')
			return false;
		
		// when last 2 char is "BA". 
		// we do not want it to be swapped & become "AB".
		if (r == l + 1 && str.charAt(i) == 'A' && str.charAt(l) == 'B') {
			return false;
		}
		
		// when last 2 char is "AB" &&  l == i
		// r = B  &  l = A
		if (r == l + 1 && l == i && str.charAt(r) == 'B' && str.charAt(l) == 'A') {
			return false;
		}
		return true;
	}

	private static void permute(String str, int l, int r) {

		// we reach here only when permutation is valid
		if (l == r) {
			System.out.println(str);
			return;
		}

		// Recursively generate all permutation
		for (int i = l; i <= r; i++) {

			// Fix str[i] only if it valid move.
			if (isSafe(str, l, i, r)) {
				str = swap(str, i, l);

				permute(str, l + 1, r);

				str = swap(str, i, l);
			}
		}
	}

	private static String swap(String str, int i, int l) {
		char temp;
		// we can't change string directly
		// so
		// converting String to CHARACTER ARRAY
		char[] charArray = str.toCharArray();

		// swap the i & l character
		temp = charArray[i];
		charArray[i] = charArray[l];
		charArray[l] = temp;

		// valueOf returns STRING representation of CHAR array
		return String.valueOf(charArray);
	}

}
