package test2.presentation;

import test2.service.Service;

public class Main {

	public static void main(String[] args) {
		Service service = new Service();
		System.out.println(service.division(10, 0));
	}

}
