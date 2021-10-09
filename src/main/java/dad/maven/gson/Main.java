package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe el nombre");
		String n = scanner.nextLine();
		System.out.println("Escribe el apellido");
		String a = scanner.nextLine();
		System.out.println("Escribe la edad");
		String e = scanner.nextLine();
		
		Persona p=new Persona(n,a,e);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}
}
