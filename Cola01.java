
package cola01;
import java.util.Scanner;
public class Cola01 {

    public static void main(String[] args) {
Scanner lector=new Scanner (System.in);
int opcion;
System.out.println("secciones un programa \n");
System.out.println("programa 01 \n");
System.out.println("programa 02 \n");
System.out.println("programa 03\n");
System.out.println("programa 04\n");
opcion =lector.nextInt();
switch(opcion){
        case 1:
            pila1.main(args);
            break;
            case 2:
            Pila2.main(args);
            break;
            case 3:
            Pila3.main(args);
            break;
            case 4:
            Pila4.main(args);
            break;
        
    }
    }
    
}
