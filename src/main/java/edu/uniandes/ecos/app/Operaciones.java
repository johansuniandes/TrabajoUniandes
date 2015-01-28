package edu.uniandes.ecos.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Operaciones {

	private File archivo = null;
	private FileReader fr = null;
	private BufferedReader br = null;
		
	
	private ArrayList<Float> llenarLista(){
		
		ArrayList<Float> numerosArray = new ArrayList<Float>();
		try{        	
        	archivo = new File ("data/numeros.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            numerosArray = new ArrayList<Float>();     
            
            String numeros;            
            while((numeros=br.readLine())!=null)
            	numerosArray.add(Float.parseFloat(numeros));
                                   
           }
        catch(Exception ex){
        	ex.printStackTrace();
                           }
        finally{
        	 try{                    
                 if( null != fr ){   
                    fr.close();     
                                  }                  
              }catch (Exception e){ 
                 e.printStackTrace();
              }        	
                }
		
		return numerosArray;
	}
	
	public float obtenerMedia(){
		
		float media = 0;
		ArrayList<Float> numerosArray = llenarLista();
        for(int i = 0; i < numerosArray.size(); i++)
     	   media += numerosArray.get(i);            	               
     
        media = media / numerosArray.size();
		return media;
	                             }
	
	public float obtenerDesviacion(){

		float media = 0, desviacion = 0;
		media = obtenerMedia();
		ArrayList<Float> numerosArray = llenarLista();		
		for(int i = 0; i < numerosArray.size(); i++)
        	desviacion += (numerosArray.get(i) - media) * (numerosArray.get(i) - media);
        
        desviacion = desviacion / (numerosArray.size()-1);
        desviacion = (float) Math.sqrt(desviacion);
        return desviacion;
		
	}	

}
