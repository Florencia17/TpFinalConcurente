package org.example;

public class Main {
    public static void main(String[] args) {
        int numProyectos = 5; // Número de proyectos metalúrgicos
        SierraSensitiva sierra = new SierraSensitiva();

        for (int i = 1; i <= numProyectos; i++) {
            Proyecto proyecto = new Proyecto(i, sierra);
            Thread proyectoThread = new Thread(proyecto);
            proyectoThread.start();
        }
    }
}