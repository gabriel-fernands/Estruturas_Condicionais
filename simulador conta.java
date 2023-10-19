
public class contaBancaria {
    private   String nome;
    private   int idade;
    private String titular;
    private double saldo;
    private double media = 0;

    public contaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            //saldo = saldo + valor;
            System.out.println("Deposito de R$" + valor + " realizado. saldo atual: R$" + saldo);
        }else {
            System.out.println("valor inválido para deposito.");
        }
    }
    public void saque(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            //saldo = saldo - valor;
            System.out.println("saque de R$" + valor + " realizado. saldo atual:R$" + saldo);
        }else {
            System.out.println("saldo insuficiente ou valor de saque invalido.");
        }
    }
    public void transferencia(contaBancaria destinatario, double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            //saldo = saldo - valor;
            destinatario.deposito(valor);
            System.out.println("transferencia de R$" + valor + " realizada para" + destinatario.getTitular() + ".saldo atual: R$" + saldo);
        }else {
            System.out.println("saldo insuficiente ou valor de saque invalido.");
        }
}
public String getTitular(){
        return titular;
        }
public double getSaldo(){
        return saldo;
        }
}

