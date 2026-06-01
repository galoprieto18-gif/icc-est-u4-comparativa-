import controles.SortPersonaMethods;
import models.Persona;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println();
        imprimir(10000);
        System.out.println();
        imprimir(50000);
        System.out.println();
        imprimir(10000);

    }

    
        public static Persona[] generarPersonas(int cantidad){
       
        Persona [] personas = new Persona [cantidad];

       for (int i = 0; i < cantidad; i++) {
            String nombre = "persona" + (i+1);
            int edad = (int) (Math.random() * 101);
            personas [i] = new Persona(nombre,edad);
       }
       return personas;
        }
    
    
        public static void imprimir (int cantidad){
            Persona[] base = generarPersonas(cantidad);
            Persona[] copiaInsercion = base.clone();
            Persona[] copiaQuickSort = base.clone();
            System.out.println(base.length);

            SortPersonaMethods im = new SortPersonaMethods();
            long inicio = System.nanoTime();
            im.insertionSort(copiaInsercion);
            im.quickSort(copiaQuickSort,0,copiaQuickSort.length - 1);
            long fin = System.nanoTime();
            System.out.print("Desordenado" + " | "+ " Inserccion " + cantidad + " | " + (fin-inicio) /1_000_000 + "ms");
        }
        
    
}






