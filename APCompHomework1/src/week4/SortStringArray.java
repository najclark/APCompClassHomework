package week4;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		String[] ss = { "Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman" };
		Arrays.sort(ss);

		for (String s : ss) {
			if (s.indexOf("L") == 0 || s.indexOf("l") == 0) {
				System.out.println();
			}
			else{
				System.out.println(s);
			}
		}
	}

}
