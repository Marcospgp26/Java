public class Triangulo {
    private float l1,l2,l3;

    public float getL1() {
        return l1;
    }

    public float getL2() {
        return l2;
    }

    public float getL3() {
        return l3;
    }

    public boolean seL1(float l1)
    {
        if(l1 <= 0) return false;
        else {
            this.l1 = l1;
            return true;
        }
    }

    public boolean setL2(float l2)
    {
        if(l2 <= 0) return false;
        else
        {
            this.l2 = l2;
            return true;
        }
    }

    public boolean setL3(float l3)
    {
        if(l3 <= 0) return false;
        else
        {
            this.l3 = l3;
            return true;
        }
    }

    public boolean possivel()
    {
        if(l1 > (l2 + l3)) return false;
        if(l2 > (l1 + l3)) return false;
        if(l3 > (l2 + l1)) return false;
        return true;
    }

    public float perimetro()
    {
        return l1 + l2 + l3;
    }

    public String tipo()
    {
        if((l1 == l2) && (l2 == l3)) return "Equilatero";
        else if ((l1 != l2) && (l1 != l3) && (l2 != l3)) return "Escaleno";
        return "Isoceles";
    }


}
