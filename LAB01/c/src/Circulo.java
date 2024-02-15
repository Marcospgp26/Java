import static java.lang.Math.*;
public class Circulo {

    private String nome;
    private Ponto cnt;
    private float raio;

    public void setCnt(Ponto cnt) {
        this.cnt = cnt;
    }


    public void setRaio(float raio) {
        this.raio = raio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getRaio() {
        return raio;
    }

    public Ponto getCnt() {
        return cnt;
    }

    public String getNome() {
        return nome;
    }

    public float area()
    {
        return(float)(PI * pow(raio, 2));
    }

    public float diametro()
    {
        return 2 * raio;
    }

    public float circunferencia()
    {
        return (float)(PI * diametro());
    }

    public void imprime_dados()
    {
        System.out.printf("\nnome:%s\nx: %f y: %f\narea: %f\n circunferencia: %f\ndiametro: %f\n",nome,cnt.getX(),cnt.getY(),area(),circunferencia(),diametro());
    }
}
