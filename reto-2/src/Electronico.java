public class Electronico extends Juguete {
    private int cantidadBaterias;
    private int vidaUtil;

    public Electronico(int cantidadBaterias, int vidaUtil, String nombre, String tipo, int numeroPiezas, int edadPermitida) {
        super(nombre, tipo, numeroPiezas, edadPermitida);
        this.cantidadBaterias = cantidadBaterias;
        this.vidaUtil = vidaUtil;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\tbaterias:"+cantidadBaterias+ "\n"+"\tVida útil:"+vidaUtil+ "\n";
    }
}
