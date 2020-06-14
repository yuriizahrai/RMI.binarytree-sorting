package lpi.server.rmi;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Вітаємо на RST TCP Сервері. Нажміть ENTER щоб вимкнути.");

		try (ComputeEngine server = new ComputeEngine(args)) {
			server.run();
			System.in.read();
		}
		
		System.out.println("Сервер зупинено.");
	}
}
