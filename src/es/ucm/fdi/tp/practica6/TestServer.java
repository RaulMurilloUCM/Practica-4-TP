package es.ucm.fdi.tp.practica6;

public class TestServer {
	public static void main(String[] args) {
		String[] as = { "-am", "server", "-g", "ataxx", "-d", "5x5", "-p", "X,O", "-o", "4"};
		Main.main(as);
	}
}
