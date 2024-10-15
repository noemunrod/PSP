/*
*
* Activitat1.java
*
* Creada el 15 oct 2024, 15:22:00
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 15 oct 2024
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 15 oct 2024
*/
/**
 * Activitat1
 */
public class Activitat1 extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("El TombaTossals");
            try {
                sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Activitat1 main = new Activitat1();
        main.start();
    }
}