public class App {
    public static void main(String[] args) throws Exception {
        ContaInvestimento poupanca = new ContaInvestimento(1000,10);

        System.out.println(poupanca.mostrarSaldo());
        poupanca.adicioneJuros();
        System.out.println(poupanca.mostrarSaldo());
        poupanca.adicioneJuros();
        System.out.println(poupanca.mostrarSaldo());
        poupanca.adicioneJuros();
        System.out.println(poupanca.mostrarSaldo());
        poupanca.adicioneJuros();
        System.out.println(poupanca.mostrarSaldo());
        poupanca.adicioneJuros();
        System.out.println(poupanca.mostrarSaldo());

    }
}
