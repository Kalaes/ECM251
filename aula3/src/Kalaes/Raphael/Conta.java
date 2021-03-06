package Kalaes.Raphael;

public class Conta {
    int numero;
    double saldo;
    Cliente cliente;

    void visulizarSaldo() {
        System.out.println("Saldo da conta: R$" + this.saldo);
    }

    void depositar(double valor) {
// (sao iguais)   this.saldo = this.saldo + valor;
                this.saldo += valor;
    }
    boolean sacar(double valor) {
        if(this.saldo>=valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    boolean TransferirPara(double valor, Conta destino) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
