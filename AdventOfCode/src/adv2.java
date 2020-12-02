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
    int correcto = 0;
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
    
       // ADV2.1
//       for (Iterator iterator = lineas.iterator(); iterator.hasNext();) {
//		String string = (String) iterator.next();
//		String[] partes = string.split("-");
//		int min = Integer.parseInt(partes[0]);
//		String maxS = partes[1];
//		String[] partes2 = maxS.split(" ");
//		int max = Integer.parseInt(partes2[0]);
//		char caracter = partes2[1].charAt(0);
//		String frase = partes2[2];
//		long count = frase.chars().filter(ch -> ch == caracter).count();
//		
//		if (count>=min && count <= max)
//			correcto++;
//		
//	}
       
// ADV2.2
       
       for (Iterator iterator = lineas.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		String[] partes = string.split("-");
		int pos1 = Integer.parseInt(partes[0]);
		String maxS = partes[1];
		String[] partes2 = maxS.split(" ");
		int pos2 = Integer.parseInt(partes2[0]);
		char caracter = partes2[1].charAt(0);
		String frase = partes2[2];
		if((frase.indexOf(caracter,pos1-1) == (pos1-1)) && !(frase.indexOf(caracter,pos2-1) == pos2-1) || (!(frase.indexOf(caracter,pos1-1) == (pos1-1)) && (frase.indexOf(caracter,pos2-1) == pos2-1))) {
			correcto++;
		}
		
	}
       System.out.println(correcto);
      
       	
       
       
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
