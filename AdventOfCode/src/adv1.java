import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class adv1 {
	public static void main(String[] args) {
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
		try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\Users\\Rubén\\Documents\\IngInf2019-2020\\ADV2020\\AC1.1.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         List<Integer> lineas = new ArrayList<Integer>();
	         while((linea=br.readLine())!=null)
	            lineas.add(Integer.parseInt(linea));
	         	
	         for (Iterator iterator = lineas.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				 for (Iterator iterator2 = lineas.iterator(); iterator2.hasNext();) {
					Integer integer2 = (Integer) iterator2.next();
					for (Iterator iterator3 = lineas.iterator(); iterator3.hasNext();) {
						Integer integer3 = (Integer) iterator3.next();
						if (2020 - integer3 - integer2 == integer)
							System.out.println(integer3*integer2*integer);
					}
				}
				
			}
	         
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
		
	}
	
}
