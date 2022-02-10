import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;


public class Identificador_ExpRegular 
{

	static Scanner lectura = new Scanner (System.in);
	 
	public static void main(String[] args) 
	{
		System.out.print("Ingrese los datos a evaluar: \n");
		String entero; 
		entero = lectura.next();
		
		/*Entero*/
		Pattern pat = Pattern.compile("^[-+]?[0-9]+$");
		Matcher mat = pat.matcher(entero);
		/*Real*/
		Pattern pat1 = Pattern.compile("^[-+]?[0-9]*[\\.,][0-9]+$");
		Matcher mat1 = pat1.matcher(entero);
		/*Notación*/
		Pattern pat2 = Pattern.compile("^[-+]?[0-9]*[\\.,]?[0-9]+([eE][-+]?[0-9]+)$");
		Matcher mat2 = pat2.matcher(entero);
		/*Correo*/
		Pattern pat3 = Pattern.compile("^[A-Za-z0-9\\.-_]+@[a-z]+\\.[a-z]+(\\.[a-z]+)?$");
		Matcher mat3 = pat3.matcher(entero);
		
        if (mat.find())
        	System.out.println("Es un número entero");
        else if (mat1.find())
        	System.out.println("Es un número real");
        else if (mat2.find())
        	System.out.println("Es un número en notación cientifica");
        else if (mat3.find())
        	System.out.println("Es un correo electronico");
        else
            System.out.println("La expresión"+ " "+ entero+" "+"no corresponde a un número entero,"
            		+ " número real, número en notación científica o correo electrónico.");
	   	
    }	
    	
}


/*Contiene las clases Pattern y Matcher y la excepción PatternSyntaxException.
--Clase Pattern: Un objeto de esta clase representa la expresión regular. 
----Contiene el método compile(String regex) que recibe como parámetro la expresión regular y devuelve un objeto de la clase Pattern.
--La clase Matcher: Esta clase compara el String y la expresión regular. 
----Contienen el método matches(CharSequence input) que recibe como parámetro el String a validar y devuelve true si coincide con el patrón.
--El método find() indica si el String contienen el patrón.*/		
		
	
		
		/*//------------------------ verificar si es un entero------------------------------------------//
	
		System.out.print("Ingrese la cadena a evaluar: \n");
		String entero; 
		entero = lectura.next();
			
		//Se estrablece la expresión regular//
		Pattern pat = Pattern.compile("^[-+]?[0-9]+$");
		//Evalua lo que ingreso por teclado//
		Matcher mat = pat.matcher(entero);
		if (mat.find())
		 {
		    	System.out.println("Es un número entero");
			
		 }
		 else
		 { 
		 		System.out.println("No es número entero");
		 }
		 
		*/
		



		/* OK //---------------------- verificar si es un real----------------------------------------------//
		System.out.print("Ingrese la cadena a evaluar: \n");
		String entero; 
		entero = lectura.next();
			
		//Se estrablece la expresión regular//
		Pattern pat = Pattern.compile("^[-+]?[0-9]*[\\.,][0-9]+$");
		//Evalua lo que ingreso por teclado//
		Matcher mat = pat.matcher(entero);
		if (mat.find())
		 {
		    	System.out.println("Es un número real");
			
		 }
		else
		  {
				System.out.println("No es un número real");
		  }
		*/
		



		/*  OK// ------------------------verificar si es notacion cientifica--------------------------------//
		System.out.print("Ingrese la cadena a evaluar: \n");
		String entero; 
		entero = lectura.next();
			
		//Se estrablece la expresión regular//
		Pattern pat = Pattern.compile("^[-+]?[0-9]*[\\.,]?[0-9]+([eE][-+]?[0-9]+)$");
		//Evalua lo que ingreso por teclado//
		Matcher mat = pat.matcher(entero);
		if (mat.find())
		 {
		    	System.out.println("Es un número en notación cientifica");
			
		 }
		else
		  {
				System.out.println("No es un número notación cientifica");
		  }
		*/



		
		/* OK //------------------------------------verificar si es correo electronico-------------------------//
		System.out.print("Ingrese la cadena a evaluar: \n");
		String entero; 
		entero = lectura.next();
			
		//Se estrablece la expresión regular//
		Pattern pat = Pattern.compile("^[A-Za-z0-9\\.-_]+@[a-z]+\\.[a-z]+(\\.[a-z]+)?$");
		//Evalua lo que ingreso por teclado//
		Matcher mat = pat.matcher(entero);
		if (mat.find())
		 {
		    	System.out.println("Es un correo electronico");
			
		 }
		else
		  {
				System.out.println("No es un correo electronico");
		  }
		*/
		

