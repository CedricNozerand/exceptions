package test6.service;

public class Service {

	Service2 service2;
	
	public Service() {
		service2 = new Service2();
	}
	
	public boolean createFile() {
		return service2.createFile();
	}
}
