package test5.service;

import java.io.File;
import java.io.IOException;

public class Service2 {

	public boolean createFile() throws IOException {
		File file = new File("");
		return file.createNewFile();
	}
}
