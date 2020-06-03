package test4.presentation;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("toto.txt");
		file.createNewFile();
	}
}
