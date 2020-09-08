
package poo;

import javax.swing.JOptionPane;

public class Operacion {
    // atributos
    int n1;
    int n2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //metodos 
// metodo para pedir numeros
    public void leerNumeros(){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("dijite el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("dijite el segundo numero: "));
        
        
    }
    //metodo para sumar 
    public void sumar(){
        suma = n1+n2;
    }


//metodo para restar
    public void restar (){
        resta= n1-n2;
    }
//metodo para multiplicar
    public void multiplicar(){
        multiplicacion = n1*n2;
    }

//metodo para dividr 
    public void dividir(){
        division = n1/n2;
   
    }
    public void mostrarResultados(){
        System.out.println("la suma es:" +suma);
        System.out.println("la resta es:" +resta);
        System.out.println("la multiplicacion es:" +multiplicacion);
        System.out.println("la division es:" +division );
       
    }
    
}


