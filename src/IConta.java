
public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();

    void enviarPix(Conta numeroPix, double valor);

    void receberPix(double valor);
}
