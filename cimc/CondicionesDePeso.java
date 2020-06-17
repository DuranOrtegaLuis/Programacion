
package cimc;

public class CondicionesDePeso {

    protected String bajoPeso;
    protected String obesidad;
    protected String obesividadMordiba;
    protected String desnutricion;
    protected String pesoNormal;
    protected String sobrePeso;

   
    public CondicionesDePeso() {
        this.bajoPeso = "tu bajo peso podría hacer disminuir "
                + "\ntus defensas inmunitarias. "
                + "\nTe aconsejamos una dieta equilibrada "
                + "\ny ejercicio para ganar peso y aumentar "
                + "\ntu masa de muscular.";

        this.obesidad = "Tu exceso de peso te pone "
                + "\nen peligro para un problema "
                + "\ncardíaco, diabetes, hipertensión, "
                + "\nenfermedad de vesícula y algunos"
                + "\ncánceres.";

        this.desnutricion = "Tienes una cantidad baja de grasa"
                + "\nen el ncuerpo. ";

        this.obesividadMordiba = "La obesidad mórbida es la forma más"
                + "\ntemible del exceso de peso pues "
                + "\nademás de disminuir la expectativa"
                + "\nde vida causa discapacidad";

        this.pesoNormal = "Tu IMC es ideal. ";

        this.sobrePeso = "Estás aumentando el riesgo de "
                + "\nenfermedades"
                + "\ncon tu peso actual.";

    }

    

    public String obesidadMordiba() {
        return "Obesidad mordiba";
    }

    public String obesidad() {
        return "obesidad";
    }

    public String sobrepesoLeve() {
        return "Sobrepeso leve";
    }

    public String pesoNormal() {
        return "Peso normal";
    }

    public String desnutricion() {
        return "Desnutrició";
    }

    public String pesoBajo() {
        return "Peso bajo";
    }

    public String getBajoPeso() {
        return bajoPeso;
    }

    public String getObesidad() {
        return obesidad;
    }

    public String getObesividadMordiba() {
        return obesividadMordiba;
    }

    public String getDesnutricion() {
        return desnutricion;
    }

    public String getPesoNormal() {
        return pesoNormal;
    }

    public String getSobrePeso() {
        return sobrePeso;
    }
}
