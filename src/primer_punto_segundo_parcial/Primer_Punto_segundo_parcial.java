/*
Hacer un algoritmo que imprima los elementos de una lista uni-enlazada en orden inverso,
es decir primero imprime el último nodo,
luego el penúltimo, hasta imprimir la información del nodo cabecera.
Considere lista vacía.
 * 
 */
package primer_punto_segundo_parcial;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author martin cantillo
 */
public class Primer_Punto_segundo_parcial {
    Scanner entrada = new Scanner(System.in);
    
        public class nodo {

        int dato;
        nodo sig;

    }
        nodo cab, q, p, aux, t, m, cab2, ultimo;
         public Primer_Punto_segundo_parcial() {
        this.cab = null;
        this.q = null;
        this.p = null;
        this.aux = null;
        this.t = null;
        this.m = null;
        this.cab2 = null;
        this.ultimo = null;
    }

    public boolean listavacia() {
        if (cab == null) {
            return true;
        } else {
            return false;
        }
    }
    public nodo insertar(int info) {
        nodo n = new nodo();
        n.dato = info;
        if (listavacia()) {
            cab = n;
            p = cab;
        } else {
            p.sig = n;
            p = n; 
        }
        return p;
    }
        public void mostrarlista() {
        if (listavacia()) {
            System.out.print("la lista esta vacia ");
        } else {
            nodo r = cab;

            while (r != null) {
                System.out.print(r.dato + " -> ");
                r = r.sig;
            }

        }
    }
        public nodo Mostrar_inversa_() {
        if (listavacia() || cab.sig == null) {
            System.out.println("no hay suficientes nodos");
        } else {
            cab2 = null;
            ultimo = null;
            while (cab.sig != ultimo) {
                p = cab;
                q = null;
                while (p.sig != ultimo) {
                    q = p;
                    p = p.sig;
                }
                if (ultimo == null) {
                    cab2 = p;
                }
                p.sig = q;
                ultimo = p;
            }
            cab.sig = null;
            cab = cab2;
        }
        mostrarlista();
        return cab;
        
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("PRIMER PUNTO DEL PARCIAL ");
        System.out.println("MARTIN CANTILLO");
        Primer_Punto_segundo_parcial listas = new Primer_Punto_segundo_parcial();
        int opc, num, dato;
          do {
              System.out.println("");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Muestre la lista original ");
            System.out.println("3.imprimir lista en orden inverso ");
            System.out.println("10. Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    num = rnd.nextInt(100);
                    System.out.println("Numero [ " +num + " ] insertado");
                    listas.insertar(num);
                    break;
                case 2:
                   listas.mostrarlista();
                    break;
                case 3:
                    System.out.println("----La lista inversa quedo de la siguiente manera ----");
                    listas.Mostrar_inversa_();
                   
                    break;
               
            }
        } while (opc != 10);
    }

    }
    

