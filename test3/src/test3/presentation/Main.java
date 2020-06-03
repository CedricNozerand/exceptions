package test3.presentation;

import test3.service.Service;

public class Main {

	public static void main(String[] args) {
		Service service = new Service();
		System.out.println(service.division(10, 0));
	}

}
