import java.io.Console;

public class Principal {

	public static void main(String[] args) {

		Console consola = System.console();

		if (consola != null) {
			char[] passwd = consola.readPassword("Introduce la contrase�a: ");
		    System.out.println("Contrase�a: " + String.valueOf(passwd));
		}else {
			System.out.println("Error al obtener la consola");
			return;
		}

	}

}
