import java.util.*;

public class OrdenarcionDeUnaTablaHash {
    public static void main(String[] args) {
        HashMap<String, Integer> tabla = new HashMap<>();
        tabla.put("a", 50);
        tabla.put("b", 10);
        tabla.put("c", 90);
        tabla.put("d", 5);

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(tabla.entrySet());

        lista.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> entry : lista) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
