
package archivos;

import java.util.Random;
import java.io.*;
public class Archivos {

    public static void main(String[] args) {
      Random nv= new Random();
      int veces=nv.nextInt(10);
      for(int i=0;i<=veces;i++){
          int score=nv.nextInt(100000);
          System.out.println();
          try{
              File puntajes= new File("Puntajes.txt");
              FileWriter datos= new FileWriter(puntajes.getAbsoluteFile(),true);
              if(!puntajes.exists()){
                  puntajes.createNewFile();
              }
              try(BufferedWriter Bw = new BufferedWriter(datos)){
                  Bw.write("Score: "+score);
                  Bw.newLine();
                  Bw.close();
              }
          }catch(IOException e){
              e.printStackTrace();
          }
          }
    }
}
