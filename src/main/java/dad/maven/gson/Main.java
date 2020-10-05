package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	
	public static void main( String[] args )
    {
     
      
    	Persona p = new Persona();
    	
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Introduce nombre");
		p.Nombre=sc.nextLine();
		System.out.println("Introduce apellidos");
		p.Apellidos=sc.nextLine();
		System.out.println("Introduce edad");
		p.Edad=sc.nextInt();
			
    	
    	Gson gson = new GsonBuilder().setPrettyPrinting().create();

    	System.out.println(gson.toJson(p));
    }
	

	
	
}
