import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class adv2 {
public static void main(String[] args) {
	File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
	try {
       // Apertura del fichero y creacion de BufferedReader para poder
       // hacer una lectura comoda (disponer del metodo readLine()).
       archivo = new File ("C:\\Users\\Rubén\\Documents\\IngInf2019-2020\\ADV2020\\AC2.1.txt");
       fr = new FileReader (archivo);
       br = new BufferedReader(fr);

       // Lectura del fichero
       String linea;
       List<String> lineas = new ArrayList<String>();
       
       while((linea=br.readLine())!=null)
          lineas.add(linea);
       
       for (Iterator iterator = lineas.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		String[] partes = string.split("-");
		int min = Integer.parseInt(partes[0]);
		String maxS = partes[1];
		String[] partes2 = maxS.split(" ");
		int max = Integer.parseInt(partes2[0]);
		
		System.out.println(partes2[1]);
		
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
