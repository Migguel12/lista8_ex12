public class ContaInvestimento{
    int numeroConta;
    String nomeCorrentista;
    double saldo = 0.0;
    double taxaJuros;

    public ContaInvestimento(double saldo, double taxaJuros){
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public void alterarNome(String novoNome){
        nomeCorrentista = novoNome;
    }

    public void deposito(double valorDeposito){
        saldo = saldo + valorDeposito;
    }

    public void saque(double valorSaque){
        saldo = saldo - valorSaque;
    }

    public double mostrarSaldo(){
        return saldo;
    }

    public void adicioneJuros(){
        double juro = taxaJuros / 100;
        saldo = saldo + (saldo * juro);
    }
    
}
