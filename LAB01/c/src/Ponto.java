import static java.lang.Math.*;

public class Ponto {
    private float x, y;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public boolean setX(float x) {
        if(x < 0) return false;
        else this.x = x;
        return true;
    }

    public boolean setY(float y) {
        if(y < 0) return false;
        else this.y = y;
        return true;
    }

    public float dist_centro()
    {
        return (float) sqrt(pow(x,2) + pow(y,2));
    }

    public float dist_pontos(Ponto pnt)
    {
        return (float)sqrt(pow(x - pnt.x, 2) + pow(y - pnt.y, 2));
    }
}
