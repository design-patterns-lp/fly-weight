package flyweight;

import java.util.HashMap;
import java.util.Map;


public class AlaFactory {
    private static Map<Integer, Ala> alas = new HashMap<>();

    public static Ala getAla(Integer andar, String nome){
        Ala ala = alas.get(andar);
        if(ala == null){
            ala = new Ala(andar, nome);
            alas.put(andar, ala);   
        }
        return ala;
    }

    public static int getTotalAlas(){
        return alas.size();
    }
}
