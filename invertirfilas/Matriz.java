package invertirfilas;
import java.util.*;
public class Matriz {
   Random e1=new Random();
    Scanner lectura=new Scanner(System.in);
    int f,c;
    int num;
    public void solicitar(){
    System.out.println("Inserte el numero de las filas");
    f=lectura.nextInt();
    System.out.println("Inserte el numero de las Columnas");
    c=lectura.nextInt();
    
    System.out.println("Ingrese del 1 a que numero aleatorio:");
    num=lectura.nextInt();    
    }
    
    public void hacer(){
    int Array[][]=new int[f][c];
    
    for(int i=0; i<f; i++){
      
    for(int j=0; j<c; j++){
    Array[i][j]=1 + e1.nextInt(num);     
    }
    }

    for(int i=0;i<f;i++){
 
 for(int j=0;j<c;j++)
 {
 System.out.printf(" "+Array[i][j]+" ");
 
 } 
 System.out.println("");
 }
   System.out.println("Se A Invertido"); 
  
for(int i=0;i<c;i++){
 
 for(int j=0;j<f;j++)
 {
 System.out.printf(" "+Array[j][i]+" ");
 
 } 
 System.out.println("");
 }
    
    
    }
    
    
    
    
}
