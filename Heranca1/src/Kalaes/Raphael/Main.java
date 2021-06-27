package Kalaes.Raphael;

class Funcionarios{
    private String nome;
    private double salario;
    private String telefone;

    public String descricao(){
        return null;

    }

    public boolean executarTrabalho(){
        return true;

    }


}

class Pintor extends Funcionarios{
    @Override
    public String descricao(){
        return "Pessoa que faz servicos de Pintura";
    }
    @Override
    public boolean executarTrabalho(){
        return true;
    }


}

class Encanador extends Funcionarios{
    @Override
    public String descricao(){
        return "Pessoa que cuida de servicos de encanacao";
    }
    @Override
    public boolean executarTrabalho(){
        return true;
    }

}

class Eletricista extends Funcionarios{
    @Override
    public String descricao(){
        return "Pessoa que faz servicos de eletrica em geral";
    }
    @Override
    public boolean executarTrabalho(){
        return true;
    }


}
class Zelador extends Funcionarios{
    @Override
    public String descricao(){
        return "Pessoa que faz servicos de limpeza em geral";
    }
    @Override
    public boolean executarTrabalho(){
        return true;
    }


}

    public static void main(String[] args) {

    }