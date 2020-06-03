package test3.service;

public class Service {
	
	Service2 service2;
	
	public Service() {
		service2 = new Service2();
	}
	
	public int division(int a, int b) {
		return service2.division(a, b);
	}
}
