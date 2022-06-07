import javax.swing.JOptionPane;

public class AppSimulacion {
    // Tamaño de la pruebas
    public static void main(String[] args) {
        // Los 2000 son el numero de muestras que vamos a tomar
        Datos datos = new Datos(2000, 2000, 2000, 2000);
        //Introdimos el numero de replicas a hacer
        String numero = JOptionPane.showInputDialog("Introdusca el numeros de replica a realizar maximo 10");
        int replicas = Integer.parseInt(numero);
        int i = 0;
        //Bucle el cual nos permite hacer el numero de replicas
        while (i < replicas) {
            System.out.println("-----------Replica" + (i + 1) + "-----------");
            datos.run(i);
            new SimulacionAutobuses(datos.getPruebas1(), datos.getPruebas2(), datos.getPruebas3(),
                    datos.getPruebas4()).run();
            System.out.println("\n ");
            i++;
        }

    }

}
