package com.example.UT4_PD5;

import java.util.List;
import java.util.ArrayList;

public class ArbolBinarioBusquedaTest {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbolVacio = new ArbolBinarioBusqueda();
        ArbolBinarioBusqueda arbolUnico = new ArbolBinarioBusqueda();
        arbolUnico.insertar(10);
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(12);
        arbol.insertar(17);
        
        System.out.println("Menor clave del árbol vacío: " + arbolVacio.obtenerMenorClave()); // Esperado: null
        System.out.println("Menor clave del árbol con un solo nodo: " + arbolUnico.obtenerMenorClave()); // Esperado: 10
        System.out.println("Menor clave del árbol: " + arbol.obtenerMenorClave()); // Esperado: 3
        
        System.out.println("Mayor clave del árbol vacío: " + arbolVacio.obtenerMayorClave()); // Esperado: null
        System.out.println("Mayor clave del árbol con un solo nodo: " + arbolUnico.obtenerMayorClave()); // Esperado: 10
        System.out.println("Mayor clave del árbol: " + arbol.obtenerMayorClave()); // Esperado: 17
        
        System.out.println("Clave inmediata anterior a 11: " + arbol.obtenerClaveAnterior(11)); // Esperado: 10
        System.out.println("Clave inmediata anterior a 12: " + arbol.obtenerClaveAnterior(12)); // Esperado: 10
        System.out.println("Clave inmediata anterior a 6: " + arbol.obtenerClaveAnterior(6)); // Esperado: 5
        
        System.out.println("Cantidad de nodos en el nivel 1: " + arbol.contarNodosEnNivel(1)); // Esperado: 1
        System.out.println("Cantidad de nodos en el nivel 2: " + arbol.contarNodosEnNivel(2)); // Esperado: 2
        System.out.println("Cantidad de nodos en el nivel 3: " + arbol.contarNodosEnNivel(3)); // Esperado: 4
        
        List<NodoHoja> hojas = arbol.listarHojasConNivel();
        System.out.println("Hojas del árbol:");
        for (NodoHoja hoja : hojas) {
            System.out.println("Clave: " + hoja.clave + ", Nivel: " + hoja.nivel);
        }
        
        System.out.println("¿El árbol vacío es de búsqueda? " + arbolVacio.esArbolDeBusqueda()); // Esperado: true
        System.out.println("¿El árbol con un solo nodo es de búsqueda? " + arbolUnico.esArbolDeBusqueda()); // Esperado: true
        System.out.println("¿El árbol es de búsqueda? " + arbol.esArbolDeBusqueda()); // Esperado: true
    }
}

