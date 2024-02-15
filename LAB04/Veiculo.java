public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo()
    {
        ano = 1886;
    }

    public Veiculo(String placa, int ano)
    {
        if(((placa.charAt(3) >= 48) && (placa.charAt(3) < 58)) || ((placa.charAt(5) >= 48) && (placa.charAt(5) < 58)) || ((placa.charAt(6) >= 48) && (placa.charAt(6) < 58)) || (placa.length() != 7))
        {
            this.placa = placa;
        }
        else this.placa = "";

        if(ano <= 1886) this.ano = 1886;
        else this.ano = ano;
    }


    public void setPlaca(String placa) {
        if(((placa.charAt(3) >= 48) && (placa.charAt(3) < 58)) || ((placa.charAt(5) >= 48) && (placa.charAt(5) < 58)) || ((placa.charAt(6) >= 48) && (placa.charAt(6) < 58)) || (placa.length() != 7))
        {
            this.placa = placa;
        }
        else this.placa = "";
    }

    public void setAno(int ano)
    {
        if(ano <= 1886) this.ano = 1886;
        else this.ano = ano;
    }

    public void setAno(String ano)
    {
        this.ano = Integer.parseInt(ano);
        if(this.ano < 1886) this.ano = 1886;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public void exibir_dados()
    {
        System.out.printf("Placa: %s\nAno: %d\n\n", placa, ano);
    }
}
