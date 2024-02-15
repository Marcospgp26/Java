public class Main {
    public static void main(String[] args) {
        Circulo circ = new Circulo();
        Ponto pnt = new Ponto();

        pnt.setX(4);
        pnt.setY(0);

        circ.setCnt(pnt);
        circ.setNome("Jose");
        circ.setRaio(5);

        circ.imprime_dados();
    }
}