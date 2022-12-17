
public class Juguete {
    private String nombre;
    private String tipo;
    private int numeroPiezas;
    private int edadPermitida;

    public Juguete(String nombre, String tipo, int numeroPiezas, int edadPermitida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numeroPiezas = numeroPiezas;
        this.edadPermitida = edadPermitida;
    }
    
    @Override
    public String toString(){
        return "\tJuguete "+ tipo + " - Nombre:"+ nombre + "\n"+ "\tpiezas:"+ numeroPiezas + "\n"+ "\tedad:"+ edadPermitida+ "\n";
    }
}
