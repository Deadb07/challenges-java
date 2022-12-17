
import java.util.ArrayList;


public class productos {
    public static ArrayList<String> grupos(ArrayList<String> entrada){
       
        ArrayList<String> salida = new ArrayList<>();
        for (String i:entrada){
            if(!salida.contains(i)){
                salida.add(i);
            }
        }return salida;
    }
    
    
    public static ArrayList<Integer> necesito_del_grupo (ArrayList<Integer> indicesProductos, ArrayList<String> listaProductos, String producto) 
    {
        ArrayList<Integer>salida = new ArrayList<>();
        ArrayList<Integer>nueva = new ArrayList<>();
        for (int i=0;i<listaProductos.size();i++){
            if (producto.equals(listaProductos.get(i))){
                nueva.add(i);
            }
        }
        for (Integer i:indicesProductos){
            if (nueva.contains(i)){
                salida.add(i);
            }
        }
        return salida;
        
        
    }
    
    public static ArrayList<Integer> sirven_a_marta (ArrayList<Integer> productoSobras, ArrayList<Integer> productoYaTiene)
    {
        ArrayList<Integer>salida = new ArrayList<>();
        for (Integer i:productoSobras){
            if (!productoYaTiene.contains(i)){
                salida.add(i);
            }
        }
        return salida;
    }
    
    public static Integer cuantas_cambian(ArrayList<Integer> dupliA, ArrayList<Integer> dupliB)
    {
       int contador=0;
       if (dupliA.size()>dupliB.size()){
           for (Integer i:dupliB){
                if (!dupliA.contains(i)){
                    contador++;
                }
            }
       }
       else{
                for (Integer i:dupliA){
                    if (!dupliB.contains(i)){
                        contador++;
                    }
                }

            }
       return contador;
    }
}
