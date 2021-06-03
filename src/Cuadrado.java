public class Cuadrado extends Rectangulo{
    private double lado;
    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea(){
        return (getLado()*5);
    }

    public double getParametro(){
        return(getLado()*4);
    }

    @Override
    public String toString() {
        return "Cuadrado:" +
                " lado=" + lado;
    }
}
