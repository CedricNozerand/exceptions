package test5.service;

import java.io.IOException;

public class Service {

	Service2 service2;
	
	public Service() {
		service2 = new Service2();
	}
	
	public boolean createFile() throws IOException {
		return service2.createFile();
	}
}
