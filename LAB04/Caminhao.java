public class Caminhao extends Veiculo{
    int eixos;

    public Caminhao(String placa, int ano, int eixos)
    {
        super(placa, ano);
        if(eixos < 2) this.eixos = 2;
        else this.eixos = eixos;
    }

    public void setEixos(int eixos)
    {
        if(eixos < 2) this.eixos = 2;
        else this.eixos = eixos;
    }

    public int getEixos()
    {
        return eixos;
    }

    public void exibir_dados()
    {
        System.out.printf("Placa: %s\nAno: %d\nEixos: %d\n\n", getPlaca(), getAno(), getEixos());
    }
}
