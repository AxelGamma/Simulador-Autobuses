## Empezemos 

Dentro de este repositorio se encuentra el simulador al siguiente problema, tanto en codigo java y codigo GPSS World.

## Problema

Los autobuses urbanos llegan a la instalación de mantenimiento con tiempos de Inter llegada exponenciales con una media de 2 horas. La instalación consta de una única estación de inspección y dos estaciones de reparación idénticas, en la siguiente imagen se muestra el diagrama:
 
Cada autobús es inspeccionado, y los tiempos de inspección se distribuyen uniformemente entre 15 minutos y 1.05 horas; la estación de inspección es alimentada por una única cola FIFO. 
Históricamente, durante la inspección se ha encontrado que el 30% de los autobuses necesitan alguna reparación. 
Las dos estaciones de reparación paralelas son alimentadas por una única cola FIFO, y las reparaciones se distribuyen uniformemente entre 2.1 horas y 4.5 horas.
Realice la simulación durante 160 horas y calcule el retraso medio en cada cola, la longitud media de cada cola, la utilización de la estación de inspección y la utilización de la estación de reparación (definida como la mitad del número medio de estaciones de reparación ocupadas, ya que hay dos estaciones).
Repita la simulación 5 veces. Supongamos que la tasa de llegada de los autobuses se cuadruplica, es decir, que el tiempo medio de llegada disminuye a 30 minutos. ¿Sería capaz la instalación de soportarlo? ¿Puedes responder a esta pregunta sin la simulación?

## Intrucciones de uso simulador java

Para poder ejecutar el programa tenemos que ir a la carpeta "src" luego a "Simulacion" y el ejecutable es el "AppSimulacion".

## Instucciones de uso simulador GPSS World

 Para poder ejecutar el simulador GPSS World de este mismo problema, lo que haremos será irnos a la carpeta “src” luego a “GPSS” y copiaremos el código que esta dentro de “Código Simulación gpss.txt”.

