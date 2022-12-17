import java.util.ArrayList;

public class productos {
   
    public ArrayList<String> grupos(ArrayList<String> lista){
        ArrayList< String> aux = new ArrayList<String>();
        for (String i: lista) if (!aux.contains(i))aux.add(i);
        return aux;
    }
       
   
    public static ArrayList<Integer> necesito_del_grupo(ArrayList<Integer> list_ind, ArrayList<String> listaGrupos, String grupoInteres){
        ArrayList<Integer> aux = new ArrayList<>();
        for(Integer i: list_ind) if (listaGrupos.get(i) .equals(grupoInteres)) aux.add(i);
         return aux;
    }
   
    public ArrayList<String> sirven_a_marta (ArrayList<String> list_sobran_maria, ArrayList<String> list_tiene_marta){
        ArrayList<String> aux = new ArrayList<>();
        for (String a: list_sobran_maria) if (!list_tiene_marta.contains(a)) aux.add(a);
        return aux;
     
    }
   
    public Integer cuantas_cambian(ArrayList<String> entradaMaria, ArrayList<String> entradaMarta){
       int contA = 0,contB = 0;
       for (String a: entradaMaria) if (!entradaMarta.contains(a))contA ++;
       for (String a: entradaMarta) if (!entradaMaria.contains(a))contB ++;
       if (contA < contB)return contA;
       else return contB;
         
    }
   
}