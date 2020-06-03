package test6.service;

import java.io.File;
import java.io.IOException;

public class Service2 {

	public boolean createFile() {
		File file = new File("");
		try {
			return file.createNewFile();
		} catch (IOException e) {
			System.err.println(e.getMessage() + " : " + file);
			//e.printStackTrace();
			return false;
		}
	}
}
