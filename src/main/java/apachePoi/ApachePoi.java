package apachePoi;

import java.util.Scanner;

public class ApachePoi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double y = (double) n;
		System.out.println("Gunti");
		double x = 1 / y;
		System.out.println("Vinay");
		String s = Double.toString(x);
		int temp = 1;
		for (int i = 2; i <= s.length() - 3; i++) {

			for (int j = i + 1; j < s.length() - 1; j++) {

				if (s.charAt(i) == s.charAt(j) && s.charAt(i + 1) == s.charAt(j + 1)) {

					System.out.print(s.substring(0, j - i + 3) + " " + s.substring(j - i + 2, j - i + 2 + j - i));
					temp = 0;
					break;
				}

			}
			if (temp == 0)
				break;
		}

		if (temp == 1)
			System.out.println(s + "0" + " " + "0");

	}

}
