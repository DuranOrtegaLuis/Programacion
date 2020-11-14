
package cola01;
import java. util.Scanner;
import java. util.Random;

public class Pila4 {

  
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
  Random azar=new Random();
 char arreglo[]=new char[26];
 char asciii=65;
 String le[]=new String[26];
 int ascii[]=new int[26];
 int opcion;
do{
 System.out.println("1.-Llena\n"
        +"2.-Mostrar\n"
        +"3.-Eliminar\n"
        +"4.-Llenado Aleatorio\n"
        +"5.-Ordenado\n"
        +"6.-Manual\n"
         +"7.-Mostrar sin repetir\n"
 +"8.-Salida");
   opcion=entrada.nextInt();
switch(opcion)   {
    case 1:
   System.out.println("Comenzando llenado");     
   for(int i=0; i<arreglo.length; i++){   
   arreglo[i]=asciii;
   asciii++;
   le[i]=Character.toString(arreglo[i]);
   }
   System.out.println("llenado Correctamente");
    break;
    
    case 2:
    for(int i=0; i<ascii.length; i++){
      if(le[i]!=null){
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
      for(int i=0; i<ascii.length; i++){
      ascii[i]=azar.nextInt(90-65+1)+65;
      arreglo[i]=(char)ascii[i];   
      le[i]=Character.toString(arreglo[i]);    
     }             
    break;
  
    case 5:
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
    case 6:
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
    case 7:
   
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
    }

 
    }while(opcion!=8);
}
}
    
    


