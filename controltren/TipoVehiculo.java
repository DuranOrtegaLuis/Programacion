package controltren;

import java.util.Scanner;

public class TipoVehiculo extends Vehiculo {
 Scanner entrada=new Scanner(System.in);
    
 @Override
 public void mostrar(){

for(int i=0;i<=9;i++){
System.out.println("Ingrese el nombre de los chofer");
nom[i]=entrada.next();
/*
System.out.println(""+i);
System.out.println(""+nom[i]);*/
System.out.println("Tipo de Desplazamiento del Vehiculo\n"
+"1.-Terrestre\t"+"2.-Maritimo\t"+"3.-Aire");
mpdd[i]=entrada.nextInt();
/*
System.out.println(""+i);
System.out.println(""+mpdd[i]);*/
System.out.println("Numero de pasajeros");
pa[i]=entrada.nextInt();
/*
System.out.println(""+i);
System.out.println(""+pa[i]);*/
System.out.println("Ingrese el horario en minutos");
ho[i]=entrada.nextInt();
/*
System.out.println(""+i);
System.out.println(""+ho[i]);*/
System.out.println("Numero de Puertas");
pu[i]=entrada.nextInt();
/*
System.out.println(""+i);
System.out.println(""+pu[i]);*/
System.out.println("Numero de Ruedas");
ru[i]=entrada.nextInt();
/*
System.out.println(""+i);
System.out.println(""+ru[i]);*/
System.out.println("Matriculas");
mat[i]=entrada.next();
/*
System.out.println(""+i);
System.out.println(""+mat[i]);*/
//condiciones
if(mpdd[i]==1){
 if(pu[i]<1){
 tipo[i]="Moto";
 }
 else if(pu[i]>=1&&pu[i]<=4) {
 tipo[i]="Coche";
 }
 else if(pu[i]>4){
 tipo[i]="Tren";
 }
}
else if(mpdd[i]==2){
tipo[i]="Barco";
}
else if(mpdd[i]==3){
tipo[i]="Avion";
}

}
for(int j=0; j<=9; j++){
System.out.println("Su chofer sera:\n"+nom[j]);
System.out.println("Con un total de: "+pa[j]+" Pasajeros");
System.out.println("Tiempo estimado de llegada: "+ho[j]+" Minutos");
System.out.println("Matricula: "+mat[j]);
System.out.println("Su Tipo de Vehiculo es: "+tipo[j]);
sleep(5000);
}
 
     
     
}
 
 

 public static void sleep(int time){
try{
Thread.sleep(time);

}catch (Exception e){}
}
     
     
     

}    
    
    
    
    

