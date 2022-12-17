
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventario {
    public static List<Juguete> Juguetes = new ArrayList<>();
    
    public static void agregarJuguete(String comando){
        String[] comandoListado= comando.split("/");
        String tipo = comandoListado[1];
        String nombre = comandoListado[2];
        int numeroPiezas = Integer.parseInt(comandoListado[3]);
        int edadPermitida = Integer.parseInt(comandoListado[4]);
        
        if(tipo.equals("Mecanico")){
            String color = comandoListado[5];
            Mecanico nuevoMecanico = new Mecanico(color, nombre, tipo, numeroPiezas, edadPermitida);
            Juguetes.add(nuevoMecanico);
        } else{
            int cantidadBaterias = Integer.parseInt(comandoListado[5]);
            int vidaUtil = Integer.parseInt(comandoListado[6]);
            Electronico nuevoElectronico = new Electronico(cantidadBaterias, vidaUtil, nombre, tipo, numeroPiezas, edadPermitida);
            Juguetes.add(nuevoElectronico);
        }
                
    }
    public static void listarJuguetes(){
        System.out.println("***Inventario de Juguetes***");
        Juguetes.forEach((item) -> {
            System.out.print(item);
        }
        );
    }
    
    public static void procesarComandos(){
        Scanner entrada= new Scanner(System.in);
        String comando = entrada.nextLine();
        char opcion= comando.charAt(0);
        
        do{
            switch (opcion){
                case '1':
                    agregarJuguete(comando);
                    comando=entrada.nextLine();
                    opcion= comando.charAt(0);
                    break;
                case '2':
                    listarJuguetes();
                    comando=entrada.nextLine();
                    opcion= comando.charAt(0);
                    break;
            }
            
        } while (opcion== '1' || opcion== '2');
    }
    
    public static void main(String[] args) {
        procesarComandos();
    }
}
