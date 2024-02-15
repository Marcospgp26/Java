public class Conta_bancaria {
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void credito(float cred)
    {
        saldo += cred;
    }

    public boolean saque(float sq)
    {
        if(saldo < sq) return false;
        else
        {
            saldo -= sq;
            return true;
        }
    }
}
