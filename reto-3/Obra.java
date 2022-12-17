import java.util.ArrayList;

public class productos {
   
    public ArrayList<Integer> clases(ArrayList<Integer> lista){
        ArrayList< Integer> aux = new ArrayList<Integer>();
        for (Integer i: lista) if (!aux.contains(i))aux.add(i);
        return aux;
    }
       
   
    public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> list_ind, ArrayList<Integer> listaGrupos, Integer grupoInteres){
        ArrayList<Integer> aux = new ArrayList<>();
        for(Integer i: list_ind) if (listaGrupos.get(i) .equals(grupoInteres)) aux.add(i);
         return aux;
    }
   
    public ArrayList<Integer> noTengo (ArrayList<Integer> list_sobran_maria, ArrayList<Integer> list_tiene_marta){
        ArrayList<Integer> aux = new ArrayList<>();
        for (Integer a: list_sobran_maria) if (!list_tiene_marta.contains(a)) aux.add(a);
        return aux;
     
    }
   
    public Integer puedoCambiar(ArrayList<Integer> entradaMaria, ArrayList<Integer> entradaMarta){
       int contA = 0,contB = 0;
       for (Integer a: entradaMaria) if (!entradaMarta.contains(a))contA ++;
       for (Integer a: entradaMarta) if (!entradaMaria.contains(a))contB ++;
       if (contA < contB)return contA;
       else return contB;
         
    }
   
}