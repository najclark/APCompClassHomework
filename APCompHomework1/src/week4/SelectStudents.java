package week4;

import java.util.Random;
import java.util.Scanner;

public class SelectStudents {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int[] chosen;
		int students;

		System.out.print("How many students are in the class? ");
		int amt = s.nextInt();
		if (amt < 20) {
			System.out.println("Students has to be >= 20");
			System.exit(0);
		}
		students = amt;

		System.out.print("How many students to randomly select? ");
		amt = s.nextInt();
		if (amt < 0 || amt > 10 || amt > students) {
			System.out.println("Up to 10 students can be chosen");
			System.exit(0);
		}
		chosen = new int[amt];

		for (int i = 0; i < chosen.length; i++) {
			boolean used = false;
			int choice = r.nextInt(students) + 1;
			for (int c : chosen) {
				if (choice == c) {
					i--;
					used = true;
				}
			}
			if (!used) {
				chosen[i] = choice;
			}
		}
		
		System.out.print("Students selected are:");
		for(int c : chosen){
			System.out.print(" " + c);
		}
	}

}
