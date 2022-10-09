package com.greatlearning.corejava.services;

public class NotesCount {
	// notes=10,52,89
	// notes=89,52,10 //sorting notes in descending order
	// 900
	// notes 900/89 =10 89:10
	// amount =900-890=10
	// 10/10=1
	public void notesCount(int notes[], int amount) {
		int[] noteCounter = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}
			}
			if (amount > 0) {
				System.out.println("Exact amount can not be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(notes[i] + ":" + noteCounter[i]);
					}
				}

			}
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e + " notes of denomination 0 is invalid");
		}
	}

}
