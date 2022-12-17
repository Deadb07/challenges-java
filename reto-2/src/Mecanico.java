public class Mecanico extends Juguete{
    private String color;

    public Mecanico(String color, String nombre, String tipo, int numeroPiezas, int edadPermitida) {
        super(nombre, tipo, numeroPiezas, edadPermitida);
        this.color = color;
    }
    @Override
    public String toString(){
        return super.toString() + "\tColor:"+color+ "\n";
    }
}
