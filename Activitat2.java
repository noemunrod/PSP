/*
*
* 
*
* Creada el 15 oct 2024, 15:28:43
*
* Desarrollada por Bluesadsilk en l'empresa Abastos el dia 15 oct 2024
*
* Email de contacto: bluesadsilk@proton.me
*
*
* @autor Bluesadsilk
* @date 15 oct 2024
*/
public class Activitat2 extends Thread {
    private String name;
    private int iterNumber;

    public Activitat2(String name, int iterNumber) {
        this.name = name;
        this.iterNumber = iterNumber;
    }

    public void run() {
        for (int i = 0; i <= iterNumber; i++) {
            if (name.equals("Banyeta")) {
                try {
                    System.out.println(i);
                    sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println(i + 5);
            }
        }
    }

    public static void main(String[] args) {
        Activitat2 p1 = new Activitat2("Banyeta", 5);
        Activitat2 p2 = new Activitat2("Butoni", 5);
        p1.start();
        try {
            p1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        p2.start();

    }
}
