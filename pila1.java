
package cola01;
import java. util.Scanner;
import java. util.Random;


public class pila1 {

  
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
  Random azar=new Random();
 char arreglo[]=new char[26];
 char asciii=65;
 String le[]=new String[26];
 int ascii[]=new int[26];
 int opcion;
 do{ 
      System.out.println(
         "1.-Llenar\n"
        +"2.-Mostrar\n"
        +"3.-Eliminar\n"
        +"4.-ordenar\n"
        +"5.-agregar\n"
        +"6.-salir\n"
        );
       opcion=entrada.nextInt();
switch(opcion)   {
      case 1:
      for(int i=0; i<ascii.length; i++){
      ascii[i]=azar.nextInt(90-65+1)+65;
      arreglo[i]=(char)ascii[i];   
      le[i]=Character.toString(arreglo[i]);    
     }             
    break;
    case 2:
   
         int h=1;
            for(int i=0; i<arreglo.length; i++){
                if(h==arreglo.length){
                   h=arreglo.length-2;
      
                }
              if(arreglo[i]==arreglo[h]){
    
               arreglo[i]=48;
               le[i]=Character.toString(arreglo[i]);
              }
              else{
              }
            h++;
            }
        
        
        
        
        for(int i=0; i<ascii.length; i++){
        if(le[i]!=null&&arreglo[i]!=48){
        System.out.println("  "+
          le[i]); }        
        }
        break;
    
    case 3:
     for(int i=0; i<ascii.length; i++){
     le[i]=null;
     }   
        
    break;   
     case 4:
 for(int i=0;i<le.length;i++){
  for(int j=i+1;j<le.length;j++){
   if(ascii[i]>ascii[j])
   {
   int aux=ascii[j];
    ascii[j]=ascii[i];
    ascii[i]=aux;
   }      
  }
}
    for(int i=0; i<ascii.length; i++){
      arreglo[i]=(char)ascii[i];   
      le[i]=Character.toString(arreglo[i]);    
     }          
        break;
    
     case 5:
       int optc;
       int medidor=0;  
       do{
         System.out.println("Ingrese el dato en la posicon ["+medidor+"]");
         le[medidor]=entrada.next();
          System.out.println("Quieres llenar otro?\n"+"1.-Si"+"2.-No");
          optc=entrada.nextInt();
          medidor++;
        }while(optc!=2);
        break;
    
    
    
    
  }
 }
while(opcion!=6);
    
  }  
}
