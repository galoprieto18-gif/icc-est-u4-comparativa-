## EXPLICACION GENERAL

La lógica del codigo es buscar o encontrar en consola los tiempos necesarios para los métodos de QuickSort y inserción para controlar y manejar una lista en dos formas, como es la desordenada y la que solamente el ultimo elemento estaría por ordenar. Por la cual, se combina un controlador para ambos ordenamientos, al igual también se lo usa por medio de otro método (resultados) que asigna la información necesaria de la ejecuacion para compilar datos en consola determinada.

## RESULTADOS OBTENIDOS:

# Tabla 1. Escenario 1: arreglo completamente desordenado 

| Tamaño de muestra | Tiempo Inserción | Tiempo Quick Sort | Algoritmo más rápido |Obseravacion |
|-------------------|------------------|-------------------|----------------------|-------------|
| 10.000 | 148.1632 ms | 28.2866 ms | QuickSort | Aproximadamente 5 veces más rápido. |
| 50.000 | 4615.8521 ms | 123.9314 ms | QuickSort | La diferencia aumenta al crecer la muestra. |
| 100.000 | 18393.3449 ms | 366.132 ms | QuickSort |Mantiene tiempos bajos por la extensión de volúmen datos. |

# Tabla 2. Escenario 1: arreglo completamente desordenado 

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|-------------------|------------------|------------------|----------------------|-------------|
| 10.001 | 1.556 ms | 10.0371 ms | Inserción | Mayor ventaja ya que el arreglo está casi ordenado. |
| 50.001 | 2.1347 ms | 123.1483 ms | Inserción | No implementa muchos desplazamientos. |
| 100.001 | 5.131 ms | 357.0042 ms | Inserción | Sigue siendo mucho más eficiente en este escenario. |

## Análisis requerido

### ¿Qué algoritmo fue más rapido en el escenario desordenado?
En este escenario, el algoritmo más eficiente y rápido fue QuickSort, ya que logró tiempos de ejecución significativamente más cortos que el algoritmo de inserción en todos los tamaños de muestra. Además, la brecha de rendimiento aumentó a medida que aumentaba el volumen de datos.
### ¿Qué algoritmo fue más rapido en el escenario casi desordenado?
En este escenario, el algoritmo más conveniente fue la inserción, ya que mostró los mejores tiempos de ejecución en todos los tamaños de muestra. Esto se debe a que el arreglo ya estaba casi ordenada y el algoritmo tuvo que hacer muy pocos movimientos para colocar el nuevo elemento en su posición correcta.
### ¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?
No, el crecimiento del tamaño de muestra afectó mucho más al algoritmo de inserción cuando los datos estaban desordenados. A medida que creció el número de elementos, su tiempo de ejecución aumentó significativamente, mientras que QuickSort mantuvo un crecimiento más controlado.
### ¿Por qué Inserción puede mejorar cuando el arreglo ya está casi ordenado?
Porque simplemente el hecho de que el algoritmo recorra el arreglo compararía con elementos vecinos y realizaría desplazamientos cada vez que sea necesario. Si el arrelgo ya está ordenado, la cantidad de movimientos va hacer mínima, lo que reduce crucialmente el tiempo de ejecución. 
### ¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?
Porque divide el arreglo en subconjuntos más pequeños utilizando un pivote y los ordena de forma adecuada. Esta estrategia es considerada para omitir la cantidad de comparaciones y movimientos necesario, obteniendo un mejor estado en conjunto de datos grandes y desordenados. 

## CONCLUSIONES: 

Conclusión 1: Se pudo comprobar que el método QuickSort fue el más eficiente cuandos los datos se encontraban desordenados, ya que divide adecuadamente a los pivotes dando una mejora de comparación, provocando un tiempo de ejecución mejor al del método InsertionSort al momento de ordenar. Esto sucede debido a que el algoritmo InsertionSort tiene como complejidad O(n^2), realizando muchas más operaciones. 

Conclusión 2: El método InsertionSort demostró un mejor trabajo cuando los arreglos se econtraban ya casi ordenados,su ventaja fue grande porque lo es necesario implementar más comparaciones sin sentido, sus resultados de tiempo para 10.001, 50.001 y 100.01, superaron al método QuickSort.

Conclusión 3: Dentro del trabajo se logró analizar que un algoritmo, no es simplemente deducir un método de ordenamiento sino también conocer el estado o implementación de los arreglos, al igual en escoger un método debemos tener en cuenta sus características,su complejidad,etc. 
