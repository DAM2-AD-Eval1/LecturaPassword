import java.io.Console;

public class Principal {

	public static void main(String[] args) {

		Console consola = System.console();

		if (consola != null) {
			char[] passwd = consola.readPassword("Introduce la contraseña: ");
		    System.out.println("Contraseña: " + String.valueOf(passwd));
		}else {
			System.out.println("Error al obtener la consola");
			return;
		}

	}

}
