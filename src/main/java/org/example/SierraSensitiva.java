package org.example;

import java.util.concurrent.Semaphore;

public class SierraSensitiva {
    private Semaphore semaforo;

    public SierraSensitiva() {
        semaforo = new Semaphore(1); // Inicializado con 1 permiso (acceso exclusivo)
    }

    public void usarSierra(int proyectoID) {
        try {
            semaforo.acquire();
            System.out.println("--El proyecto " + proyectoID + " está utilizando la Sierra sensitiva.--");
            // Realizar trabajo en la sierra sensitiva
            Thread.sleep(2000);
            System.out.println("--El proyecto " + proyectoID + " ha terminado de utilizar la Sierra sensitiva.--");
            semaforo.release();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
