/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo_8;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class ListaCircular {

    private Nodo1 lc;

    public ListaCircular() {
        lc = null;
    }

    public ListaCircular insertar(String entrada) {
        Nodo1 nuevo;
        nuevo = new Nodo1(entrada);
        if (lc != null) // lista circular no vacía
        {
            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;
        }
        lc = nuevo;
        return this;
    }

    public void eliminar(String entrada) {
        Nodo1 actual;
        actual = lc;
        while ((actual.enlace != lc)
                && !(actual.enlace.dato.equals(entrada))) {
            if (!actual.enlace.dato.equals(entrada)) {
                actual = actual.enlace;
            }
        }

        // Enlace de nodo anterior con el siguiente
        // si se ha encontrado el nodo.
        if (actual.enlace.dato.equals(entrada)) {
            Nodo1 p;
            p = actual.enlace; // Nodo a eliminar
            if (lc == lc.enlace) // Lista con un solo nodo
            {
                lc = null;
            } else {
                if (p == lc) {
                    lc = actual; // Se borra el elemento referenciado por lc,
                    // el nuevo acceso a la lista es el anterior
                }
                actual.enlace = p.enlace;
            }
            p = null;
        }
    }

    public void borrarLista() {
        Nodo1 p;
        if (lc != null) {
            p = lc;
            do {
                Nodo1 t;
                t = p;
                p = p.enlace;
                t = null; // no es estrictamente necesario
            } while (p != lc);
        } else {
            System.out.println("\n\t Lista vacía.");
        }
        lc = null;
    }

    public void recorrer() {
        Nodo1 p;
        if (lc != null) {
            p = lc.enlace; // siguiente nodo al de acceso
            do {
                System.out.println("\t" + p.dato);
                p = p.enlace;
            } while (p != lc.enlace);
        } else {
            System.out.println("\t Lista Circular vacía.");
        }
    }
}