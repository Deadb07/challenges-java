
import java.util.ArrayList;


public class pruebaReto3 extends productos{
    
    public static void main(String[] args) {
        //PRUEBA 1
        String [] clases = {"verduras","verduras","granos","granos","verduras","frutas","frutas","carnes","carnes"};
        ArrayList<String> entrada = new ArrayList<>();
        for (String i: clases) entrada.add(i);
        System.out.println(grupos(entrada));
      
        
       //PRUEBA 2 
        int [] meFaltaDeLaClase1 = {0,1,3,6,8};
        String [] meFaltaDeLaClase2 = {"verduras","verduras","granos","granos","verduras","frutas","frutas","carnes","carnes"};
        String meFaltanDeLaClase3 = "verduras";
        ArrayList<Integer> indicesProductos = new ArrayList<>();
        ArrayList<String> listaProductos = new ArrayList<>();
        for(int i : meFaltaDeLaClase1) indicesProductos.add(i);
        for(String i : meFaltaDeLaClase2) listaProductos.add(i);
        System.out.println(necesito_del_grupo(indicesProductos, listaProductos, meFaltanDeLaClase3));
        


        //PRUEBA 3
        
        int [] noTengo1 = {0,1,5,6,8};
        int [] noTengo2 = {0,2,5,6,7};
        ArrayList<Integer> productoSobras = new ArrayList<>();
        ArrayList<Integer> productoYaTiene = new ArrayList<>();
        for(int i : noTengo1) productoSobras.add(i);
        for(int i : noTengo2) productoYaTiene.add(i);
        System.out.println(sirven_a_marta(productoSobras, productoYaTiene));
        
        /*
        //PRUEBA 4
        int [] cambiar1 = {0,1,2,3,6,7};
        int [] cambiar2 = {2,3,5,6,8};
        ArrayList<Integer> dupliA = new ArrayList<>();
        ArrayList<Integer> dupliB = new ArrayList<>();
        for(int i : cambiar1) dupliA.add(i);
        for(int i : cambiar2) dupliB.add(i);
        System.out.println(cuantas_cambian(dupliA, dupliB));
        */
    }
    
    
}

