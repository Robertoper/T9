public class Rectangulo {
    private double ancho;
    private double largo;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }
    public double getArea(){
        return(getAncho()*getLargo());
    }

    public double geteParametro(){
        return ((getAncho()*2)+(getLargo()*2));
    }

    @Override
    public String toString() {
        return "Rectangulo:" +
                "ancho=" + ancho +
                ", largo=" + largo +
                ", Area= "+getArea()+
                ", Parametro= "+geteParametro();
    }
}
