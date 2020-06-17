
package cimc;

public class Imc {
    protected double peso;
    protected double altura;

 
    public Imc(){

    }


    public Imc(double peso, double altura){
        this.altura = altura;
        this.peso = peso;
    }


    public double calcularIMC(){
        return (this.peso) / (this.altura * this.altura );
    }

    
   
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
