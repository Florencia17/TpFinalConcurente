package org.example;

public class Proyecto implements Runnable{
    private int proyectoID;
    private SierraSensitiva sierra;

    public Proyecto(int id, SierraSensitiva sierra) {
        proyectoID = id;
        this.sierra = sierra;
    }

    @Override
    public void run() {
            System.out.println("--El proyecto " + proyectoID + " está esperando para usar la Sierra sensitiva.--");
            sierra.usarSierra(proyectoID);
        }
}
