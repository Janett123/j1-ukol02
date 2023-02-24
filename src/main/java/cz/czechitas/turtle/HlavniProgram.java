package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {

        zofka = new Turtle();

        /*
        vyzkoušení metody čvterce
        nakresliCtverec(80);
         */

        //kreslení mašinky
        zofka.setLocation(740,230);
        nakresliObdelnik(150,100, Color.MAGENTA);

        zofka.setLocation(990,180);
        zofka.turnRight(90);
        nakresliObdelnik(150,100, Color.BLUE);

        zofka.setPenColor(new Color(70, 70,140));

        zofka.setLocation(740,350);
        zofka.turnLeft(90);
        nakresliPravouhlyTrojuhelnik(70);

        zofka.setLocation(940,380);
        nakresliKruh(8.7266);

        zofka.setLocation(850,380);
        nakresliKruh(4.3633);

        zofka.setLocation(780,380);
        nakresliKruh(4.3633);

        //kreslení sněhuláka
        zofka.setLocation(400,180);
        nakresliKruh(5.2336);

        zofka.setLocation(400,280);
        nakresliKruh(8.7266);

        zofka.setLocation(400,420);
        nakresliKruh(12.2173);

        zofka.setLocation(330,230);
        nakresliKruh(3.4907);

        zofka.setLocation(465,230);
        nakresliKruh(3.4907);

        //kresleni zmrzliny
        zofka.setLocation(90,230);
        nakresliTrojuhelnik(100);

        zofka.setLocation(140,256);
        nakresliKruh(10.472);

        //umístění žofky mimo kresbu
        zofka.turnLeft(90);
        zofka.setLocation(140,400);

    }

    private void nakresliCtverec(double strana) {
        for (int i = 0; i < 4; i++) {
            zofka.move(strana);
            zofka.turnLeft(90);
        }
    }
    private void nakresliTrojuhelnik(double strana) {
        for (int i = 0; i < 3; i++) {
            zofka.move(strana);
            zofka.turnRight(120);
        }
    }
    private void nakresliKruh(double vysec) {
        for (int i = 0; i < 36; i++) {
            zofka.turnLeft(10);
            zofka.move(vysec);
        }
    }
    private void nakresliPravouhlyTrojuhelnik(double strana){
        double prepona = Math.sqrt(2*Math.pow(strana,2));
        zofka.move(strana);
        zofka.turnLeft(135);
        zofka.move(prepona);
        zofka.turnLeft(135);
        zofka.move(strana);
    }
    private void nakresliObdelnik(double delkaStranyA, double delkaStranyB, Color barva){
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(90);
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
        }

    }
    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
