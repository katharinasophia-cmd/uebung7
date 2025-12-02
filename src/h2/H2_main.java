package h2;

import java.util.Arrays;

public class H2_main {
	public static void main(String[] args) {

		int a[] = { 3, 1, 2, 5, 6, 1 };
		int b[] = { 3, 1, 2, 5, 6, 1 };

		change(a, b, 5, 1);

	}

	public static int[] change(int[] a, int[] b, int start, int end) {

		if (end > start && Arrays.compare(a, b) != 0) {

			int[] c = new int[a.length];

			for (int i = 0; i < a.length; i++) {
				c[i] = a[i];
			}

			System.out.println(Arrays.toString(c));

			return c;
		}

		if (end > start && Arrays.compare(a, b) == 0) {

			int[] c = new int[a.length];

			for (int i = 0; i < a.length; i++) {
				c[i] = a[i];
			}

			Arrays.sort(c);
			c = Arrays.copyOfRange(c, start, end);

			System.out.println(Arrays.toString(c));

			return c;
		}

		else {
			int[] c = new int[0];

			System.out.println(Arrays.toString(c));

			return c;
		}

	}

}
