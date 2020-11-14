
package cola01;
import java. util.Scanner;
import java. util.Random;
public class Pila3 {


    public static void main(String[] args) {
    Scanner entra=new Scanner (System.in);
    Random azar=new Random ();
    int opcion;
     System.out.println("tamanño de la pila ");
     int tam=entra.nextInt();
     int pila1[]=new int[tam];
             int pila2[]=new int[tam];
                     int pila3[]=new int[tam];
    do{
        System.out.println("MENU");
        System.out.println("1 llenar pilas");
        System.out.println("2 mostrar pilas");
        System.out.println("3 vaciar pilas");
        System.out.println("4 unir pilas");
        System.out.println("5 mostrar pila C");
        opcion=entra.nextInt();
        
        switch(opcion){
            case 1:
                for(int i=0; i<pila1.length;i++){
          pila1[i]=azar.nextInt(100-1+1)+1;
          pila2[i]=azar.nextInt(200-100+1)+100;
          
                }
                 break;
                 
           case 2:
               for (int i=0; i<pila1.length;i++){
               System.out.println("pila 1  "+pila1[i]);
               System.out.println("pila 2  "+pila2[i]);
               
               }
                 
                 break;
           case 3:
              for (int i=0; i<pila1.length;i++){
                  pila1[i]=300;
                  pila2[i]=300;
              }
              System.out.println("se a borrado");
               break;
           case 4:
               int j=0;
               for(int i=pila1.length-1;i>=0; i--){
                   pila3[j]=pila1[i]+pila2[i];
                   j++; 
               }
               break;
               
                 case 5:
               for (int mu : pila3){
                   System.out.println("esto es pila c  "+mu);
               }
               break;
               
        }
        
        
        }
    while(opcion!=6);
    
   
    
    }                 
    }
    

