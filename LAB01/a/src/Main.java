import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Triangulo tr = new Triangulo();
        Scanner ent = new Scanner(System.in);
        float lado;

        do {
            System.out.println("\nInsira o primeiro lado: ");
            lado = ent.nextFloat();
        }while(!(tr.seL1(lado)));

        do {
            System.out.println("\nInsira o segundo lado: ");
            lado = ent.nextFloat();
        }while(!(tr.setL2(lado)));

        do {
            System.out.println("\nInsira o terceiro lado: ");
            lado = ent.nextFloat();
        }while(!(tr.setL3(lado)));

        if(tr.possivel()) System.out.println("\nPOSSIVEL FORMAR TRIANGULO\n");
        else System.out.println("Impossivel");

        System.out.printf("%s tem perimetro de %f", tr.tipo(), tr.perimetro());
    }
}
