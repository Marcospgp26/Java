import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(), p2 = new Ponto();
        Scanner scn = new Scanner(System.in);

        float x, y;

        do {
            x = scn.nextFloat();
            y = scn.nextFloat();

            if((x < 0) || (y < 0)) System.out.println("Numeros invalidos\n");
        }while((x < 0) || (y < 0));

        p1.setY(y);
        p1.setX(x);
        do {
            x = scn.nextFloat();
            y = scn.nextFloat();

            if((x < 0) || (y < 0)) System.out.println("Numeros invalidos\n");
        }while((x < 0) || (y < 0));
        p2.setY(y);
        p2.setX(x);

        System.out.printf("A distancia entre os pontos eh: %f", p1.dist_pontos(p2));
    }
}