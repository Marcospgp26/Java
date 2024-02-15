public class Main {
    public static void main(String[] args) {
        Veiculo vp = new Veiculo("BCV3G68", 2020);
        vp.exibir_dados();

        Caminhao cm = new Caminhao("BCV3G68", 2010, 4);
        cm.exibir_dados();

        Onibus on = new Onibus("BCV3G68", 1999, 16);
        on.exibir_dados();

        /* Nesse codigo foram usados conceitos de encapsulamento (tendo em vista que em todas as
        classes os dados estão como private, ou seja, somente são visiveis pelos objetos.Ademais,
        é visível o uso de costrutores tendo em vista que foram criados construtores em caminhao
        veiculo e onibus (todos eles recebem parametros, menos um de caminhao que substitui o contrutor
        padrao somente com verificacao de ano).Também utilizou-se de herança, tendo em vista que ambos
        caminhao e onibus herdam os atributos e métodos de herdeiro (placa e ano) e as os metodos.
        Outro ponto perceptivel é o uso de sobreposicao visto que caminhao e onibus sobrescrevem o método
        exibir dados e, em veiculos, ha sobrecarga em setAno sendo que um possui como parametro de entrada
        String e o outro int
        */
    }
}