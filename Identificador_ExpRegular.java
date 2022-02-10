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
		/*Notaci�n*/
		Pattern pat2 = Pattern.compile("^[-+]?[0-9]*[\\.,]?[0-9]+([eE][-+]?[0-9]+)$");
		Matcher mat2 = pat2.matcher(entero);
		/*Correo*/
		Pattern pat3 = Pattern.compile("^[A-Za-z0-9\\.-_]+@[a-z]+\\.[a-z]+(\\.[a-z]+)?$");
		Matcher mat3 = pat3.matcher(entero);
		
        if (mat.find())
        	System.out.println("Es un n�mero entero");
        else if (mat1.find())
        	System.out.println("Es un n�mero real");
        else if (mat2.find())
        	System.out.println("Es un n�mero en notaci�n cientifica");
        else if (mat3.find())
        	System.out.println("Es un correo electronico");
        else
            System.out.println("La expresi�n"+ " "+ entero+" "+"no corresponde a un n�mero entero,"
            		+ " n�mero real, n�mero en notaci�n cient�fica o correo electr�nico.");
	   	
    }	
    	
}


/*Contiene las clases Pattern y Matcher y la excepci�n PatternSyntaxException.
--Clase Pattern: Un objeto de esta clase representa la expresi�n regular. 
----Contiene el m�todo compile(String regex) que recibe como par�metro la expresi�n regular y devuelve un objeto de la clase Pattern.
--La clase Matcher: Esta clase compara el String y la expresi�n regular. 
----Contienen el m�todo matches(CharSequence input) que recibe como par�metro el String a validar y devuelve true si coincide con el patr�n.
--El m�todo find() indica si el String contienen el patr�n.*/		
		
	
		
		/*//------------------------ verificar si es un entero------------------------------------------//
	
		System.out.print("Ingrese la cadena a evaluar: \n");
		String entero; 
		entero = lectura.next();
			
		//Se estrablece la expresi�n regular//
		Pattern pat = Pattern.compile("^[-+]?[0-9]+$");
		//Evalua lo que ingreso por teclado//
		Matcher mat = pat.matcher(entero);
		if (mat.find())
		 {
		    	System.out.println("Es un n�mero entero");
			
		 }
		 else
		 { 
		 		System.out.println("No es n�mero entero");
		 }
		 
		*/
		



		/* OK //---------------------- verificar si es un real----------------------------------------------//
		System.out.print("Ingrese la cadena a evaluar: \n");
		String entero; 
		entero = lectura.next();
			
		//Se estrablece la expresi�n regular//
		Pattern pat = Pattern.compile("^[-+]?[0-9]*[\\.,][0-9]+$");
		//Evalua lo que ingreso por teclado//
		Matcher mat = pat.matcher(entero);
		if (mat.find())
		 {
		    	System.out.println("Es un n�mero real");
			
		 }
		else
		  {
				System.out.println("No es un n�mero real");
		  }
		*/
		



		/*  OK// ------------------------verificar si es notacion cientifica--------------------------------//
		System.out.print("Ingrese la cadena a evaluar: \n");
		String entero; 
		entero = lectura.next();
			
		//Se estrablece la expresi�n regular//
		Pattern pat = Pattern.compile("^[-+]?[0-9]*[\\.,]?[0-9]+([eE][-+]?[0-9]+)$");
		//Evalua lo que ingreso por teclado//
		Matcher mat = pat.matcher(entero);
		if (mat.find())
		 {
		    	System.out.println("Es un n�mero en notaci�n cientifica");
			
		 }
		else
		  {
				System.out.println("No es un n�mero notaci�n cientifica");
		  }
		*/



		
		/* OK //------------------------------------verificar si es correo electronico-------------------------//
		System.out.print("Ingrese la cadena a evaluar: \n");
		String entero; 
		entero = lectura.next();
			
		//Se estrablece la expresi�n regular//
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
		

