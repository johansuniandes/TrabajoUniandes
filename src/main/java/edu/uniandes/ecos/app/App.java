package edu.uniandes.ecos.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    
	
	public static void main( String[] args )
    {
		Operaciones oper = new Operaciones();
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);        
		System.out.println ("Bienvenido");
				
	        while(true){
		        System.out.println ("Si desea hallar la media presione 1, si desea hallar la desviación presione 2.");		       
		        entradaTeclado = entradaEscaner.nextLine ();
	        	
		        if(entradaTeclado.equals("1")){
		        	System.out.println ("La media es: " + oper.obtenerMedia());
		        	break;
		                                      }
		        else if(entradaTeclado.equals("2")){
		        	System.out.println ("La desviación es: " + oper.obtenerDesviacion());
		        	break;
		                                           }
		        else	        	
		        	System.out.println ("No selecciono ninguna opción valida.");
	        	
	        }	   
	        
	        System.out.println ("Fin del programa...");
    }
	
}
