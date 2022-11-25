/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo_8;

import java.io.*;
/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class Ejercicio_8_4 {

    public static void main(String[] a) throws IOException {
        String palabra;
        ListaCircular listaCp;
        int opc;
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        listaCp = new ListaCircular();
        System.out.println("EJEMPLO DE LISTA CIRCULAR");
        System.out.println("\n Entrada de Nombres. Termina con fin\n");
        while (!"fin".equals(palabra = entrada.readLine())) {
            String nueva;
            nueva = new String(palabra);
            listaCp.insertar(nueva);
        }

        System.out.println("\t\tLista circular de palabras");

        listaCp.recorrer();
        System.out.println("\n\t Opciones para manejar la lista");
        do {
            System.out.println("1. Eliminar una palabra.\n");
            System.out.println("2. Mostrar la lista completa.\n");
            System.out.println("3. Salir y eliminar la lista.\n");
            do {
                opc = Integer.parseInt(entrada.readLine());
            } while (opc < 1 || opc > 3);

            switch (opc) {
                case 1:
                    System.out.print("Palabra a eliminar: ");
                    palabra = entrada.readLine();
                    listaCp.eliminar(palabra);
                    break;
                case 2:
                    System.out.println("Palabras en la Lista:\n");
                    listaCp.recorrer();
                    break;
                case 3:
                    System.out.print("Eliminacion de la lista.");
                    listaCp.borrarLista();
            }
        } while (opc != 3);
    }
}
