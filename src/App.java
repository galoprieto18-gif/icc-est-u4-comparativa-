import java.util.concurrent.Callable;

import controles.SortPersonaMethods;
import models.Persona;
import models.Resultado;
import utils.Bencharking;

public class App {
    public static void main(String[] args) throws Exception {
        SortPersonaMethods controller = new SortPersonaMethods();
        Persona[] personas = generarPersonas(10000);
        Persona[] personasInsercion = personas.clone();
        Persona[] personasQuick = personas.clone();

         Resultado timeUno = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasInsercion);
                    return null;
                }
            },
            "Insercion",
            "Desordenado",
            personasInsercion.length
        );
        Resultado timeDos = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personasQuick,0,personasQuick.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Desordenado",
            personasQuick.length
        );

        Persona[] personasUno = generarPersonas(10_001);
        controller.insertionSort(personasUno);
        personasUno[personasUno.length-1] = new Persona("Roberto ", 20);

        Resultado timeTres = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasUno);
                    return null;
                }
            },
            "Insercion",
            "Casi ordenado + 1 persona",
            personasUno.length
        );

        Persona[] personasDos= generarPersonas(10_001);
        controller.quickSort(personasDos, 0, personasDos.length-1);
        personasDos[personasDos.length - 1] = new Persona("Galo s", 10);

        Resultado timeCuatro = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(
                        personasDos,
                        0,
                        personasDos.length - 1
                    );
                    return null;
                }
            },
            "QuickSort",
            "Casi ordenado + 1 persona",
            personasDos.length
        );

        System.out.print("---- RESULTADOS DE LA PRÁCTICA ----");
        System.out.println();
        System.out.println();

        System.out.println(timeUno);
        System.out.println(timeDos);
        System.out.println(timeTres);
        System.out.println(timeCuatro);


        Persona[] personasTres = generarPersonas(50_000);
        Persona[] personasCuatro = personasTres.clone();
        Persona[] personasCinco = personasTres.clone();

        Resultado timeCinco = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasCuatro);
                    return null;
                }
            },
            "Insercion",
            "Desordenado",
            personasTres.length
        );
        Resultado timeSeis = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personasCinco,0,personasCinco.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Desordenado",
            personasCinco.length
        );

        Persona[] personasSiete = generarPersonas(50_001);
        controller.insertionSort(personasSiete);
        personasSiete[personasSiete.length-1] = new Persona(" ", 23);

        Resultado timeSiete = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasSiete);
                    return null;
                }
            },
            "Insercion",
            "Casi ordenado + 1 persona",
            personasSiete.length
        );

        Persona[] personasOcho = generarPersonas(50_001);
        controller.quickSort(personasOcho, 0, personasOcho.length-1);
        personasOcho[personasOcho.length-1] = new Persona("martin ", 23);

        Resultado timeOcho = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personasOcho,0,personasOcho.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Casi ordenado + 1 persona",
            personasOcho.length
        );

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println();

        System.out.println(timeCinco);
        System.out.println(timeSeis);
        System.out.println(timeSiete);
        System.out.println(timeOcho);

        Persona[] personasNueve = generarPersonas(100_000);
        Persona[] personasDiez = personasNueve.clone();
        Persona[] personasOnce = personasNueve.clone();

        Resultado timeNueve = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasDiez);
                    return null;
                }
            },
            "Insercion",
            "Desordenado",
            personasDiez.length
        );
        Resultado timeDiez = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personasOnce,0,personasDiez.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Desordenado",
            personasOnce.length
        );

        Persona[] personasDoce = generarPersonas(100_001);
        controller.insertionSort(personasDoce);
        personasDoce[personasDoce.length-1] = new Persona("Luis ", 15);

        Resultado timeOnce = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.insertionSort(personasDoce);
                    return null;
                }
            },
            "Insercion",
            "Casi ordenado + 1 persona",
            personasDoce.length
        );

        Persona[] personasTrece = generarPersonas(100_001);
        controller.quickSort(personasTrece, 0, personasTrece.length-1);
        personasTrece[personasTrece.length-1] = new Persona("Fabian", 18);

        Resultado timeDoce = Bencharking.medirTiempo(
            new Callable<Void>() {
                @Override
                public Void call() {
                    controller.quickSort(personasTrece,0,personasTrece.length - 1);
                    return null;
                }
            },
            "QuickSort",
            "Casi ordenado + 1 persona",
            personasTrece.length
        );

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println();

        System.out.println(timeNueve);
        System.out.println(timeDiez);
        System.out.println(timeOnce);
        System.out.println(timeDoce);


    }

    public static Persona[] generarPersonas(int cantidad) {
        Persona[] personas = new Persona[cantidad];
        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona" + (i + 1);
            int edad = (int)(Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }
        return personas;
    }
}