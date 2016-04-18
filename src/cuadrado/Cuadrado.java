/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

import java.io.*;
import java.lang.String;
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
      int tamcub;
      int contador =1;
      
        System.out.println("Ingrese el numero de lineas que tendra el cuadrado");
        tamcub=Integer.parseInt(obj.readLine());
        System.out.println("");
      int tamax = tamcub*2;
      String[][] matri = new String[tamax][tamax];
      
      //for para filas
        for(int fila=1; fila<tamax; fila++){
            for(int col=1; col<tamax; col++){
                if(col<=tamcub && fila==1){
                    matri[fila][col]="*";
                }else{
                    matri[fila][col]=" ";
                }
                if(fila!=1 && col<tamcub){
                    if(col==1){
                        matri[fila][col]="*";
                    }else if(col == tamcub){
                        matri[fila][col]="*";
                    }
                }
                if(col>tamcub){
                    if(fila!=1){
                        if(fila)
                        matri[fila][col]="*";
                    }
                }
                if(fila==tamcub && col<=tamcub){
                    matri[fila][col]="*";
                }
            }
            
        }
        if(tamax==tamax){
                System.out.println("hola");
            }
        
        for(int i=1; i<tamax; i++){
            
            for(int x=1; x<tamax; x++){
                System.out.print(matri[i][x]);
            }
            System.out.println("\n");
        }
        
        
        
        
    }
}
