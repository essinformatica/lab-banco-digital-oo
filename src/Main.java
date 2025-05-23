
public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.enviarPix(cc, 100);
        cc.receberPix(100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
