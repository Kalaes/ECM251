package Kalaes.Raphael;


interface Funcionarios {
    public String descricao();

    public boolean executarTrabalho();
}

class Pintor implements Funcionarios {
    String nome;
    double salario;
    String telefone;
    public String  descricao() {

        nome = "Paulo";
        salario = 1200;
        telefone = "923425643";

        System.out.println("Pessoa que faz servicos de Pintura.\n"+ "Nome:" + nome +"\n Salario:"+ salario+ "\n Telefone:"+ telefone);
        return null;
    }

    public boolean executarTrabalho() {
        System.out.println("No momento ele esta trabalhando: "+ true + "\n");
        return true;
    }
}
class Encanador implements Funcionarios {
    String nome;
    double salario;
    String telefone;
    public String  descricao() {

        nome = "Sergio";
        salario = 900;
        telefone = "912345678";

        System.out.println("Pessoa que cuida de servicos de encanacao.\n"+ "Nome:" + nome +"\n Salario:"+ salario+ "\n Telefone:"+ telefone);
        return null;
    }

    public boolean executarTrabalho() {
        System.out.println("No momento ele esta trabalhando: "+ true+ "\n");
        return true;
    }
}
class Eletricista implements Funcionarios {
    String nome;
    double salario;
    String telefone;
    public String  descricao() {

        nome = "Marcos";
        salario = 1500;
        telefone = "998765432";

        System.out.println("Pessoa que faz servicos de eletrica em geral.\n"+ "Nome:" + nome +"\n Salario:"+ salario+ "\n Telefone:"+ telefone);
        return null;
    }

    public boolean executarTrabalho() {
        System.out.println("No momento ele esta trabalhando: "+ false + "\n");
        return true;
    }
}
class Zelador implements Funcionarios {
    String nome;
    double salario;
    String telefone;
    public String  descricao() {

        nome = "Jorge";
        salario = 800;
        telefone = "911456787";

        System.out.println("Pessoa que faz servicos de limpeza em geral.\n"+ "Nome:" + nome +"\n Salario:"+ salario+ "\n Telefone:"+ telefone);
        return null;
    }

    public boolean executarTrabalho() {
        System.out.println("No momento ele esta trabalhando: "+ true + "\n");
        return true;
    }
}




class Main {
    public static void main(String[] args) {
        Pintor Pintor = new Pintor();
        Pintor.descricao();
        Pintor.executarTrabalho();

        Encanador Encanador = new Encanador();
        Encanador.descricao();
        Encanador.executarTrabalho();

        Eletricista Eletricista = new Eletricista();
        Eletricista.descricao();
        Eletricista.executarTrabalho();

        Zelador Zelador = new Zelador();
        Zelador.descricao();
        Zelador.executarTrabalho();
    }
}

