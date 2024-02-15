public class Onibus extends Veiculo{

    private int assentos;

    public Onibus(String placa, int ano, int assentos)
    {
        super(placa, ano);
        if(assentos < 5) this.assentos = 5;
        else this.assentos = assentos;
    }

    public void setAssentos(int assentos)
    {
        if(assentos < 5) this.assentos = 5;
        else this.assentos = assentos;
    }

    public int getAssentos()
    {
        return assentos;
    }

    public void exibir_dados()
    {
        System.out.printf("Placa: %s\nAno: %d\nAssentos: %d\n\n", getPlaca(),getAno(), assentos);

    }


}
