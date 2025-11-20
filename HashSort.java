import java.io.*;
import java.util.*;

public class HashSort {

    public static void main(String[] args) {

        try {
            // Leer archivo
            Scanner sc = new Scanner(new File("input.txt"));

            HashMap<String, Integer> tabla = new HashMap<>();

            // Leer pares clave-valor
            while (sc.hasNext()) {
                String clave = sc.next();
                int valor = sc.nextInt();
                tabla.put(clave, valor);
            }

            // Ordenar por clave
            TreeMap<String, Integer> ordenado = new TreeMap<>(tabla);

            // Guardar en archivo
            PrintWriter pw = new PrintWriter("output.txt");

            for (String clave : ordenado.keySet()) {
                pw.println(clave + " = " + ordenado.get(clave));
            }

            pw.close();

            System.out.println("Hash table ordenada correctamente.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
