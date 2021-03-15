package Kalaes.Raphael;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quase 5 temporada ai!!");
	    //Criar uma referencia para Conta
        Conta c1;
        //Instanciar um objeto Conta
        c1 = new Conta();
        c1.cliente = new Cliente();

        c1.cliente.titular = "Inuyasha";
        c1.saldo = 199.99;

        c1.visulizarSaldo();
        c1.visulizarSaldo();

        Conta c2 = new Conta();
        c2.cliente = new Cliente();
        c2.cliente.titular = "Seichomaru";
        c2.saldo = 1000;
        c2.visulizarSaldo();

        c1.depositar(20);
        c2.depositar(35.99);

        c1.visulizarSaldo();
        c2.visulizarSaldo();

        if(c1.sacar(100)){
            System.out.println("Deu bom!");
        }else{
            System.out.println("Deu ruim!!");
        }
        c1.visulizarSaldo();

        if (c1.TransferirPara(1000,c2)){
            System.out.println("Deu bom!! Transferiu");
        }else{
            System.out.println("Deu ruim!! Nao foi!");
        }

        c1.visulizarSaldo();
        c2.visulizarSaldo();

        System.out.println("C1:" + c1.toString());
        System.out.println("C2:" + c2.toString());
    }
}
