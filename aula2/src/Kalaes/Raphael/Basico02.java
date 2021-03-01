package Kalaes.Raphael;

public class Basico02 {
    // Estruturas de decisao
    public static void main(String[] args) {
        int ano = 2021;

        // Estrutura de decisao simples
//        if(ano % 2 == 0){
//            System.out.println("Ano Par!");
//        }
//        if(ano % 2 == 1){
//            System.out.println("Ano Impar!");
//        }

        //Estrutura de decisao composta
        if (ano %2 == 0){
            System.out.println("Ano Par!");
        } else{
            System.out.println("Ano Impar!");
        }
        // Varias decisoes
        switch (ano){
            case 2020:
                System.out.println("Vixi!");
                break;
            case 1996:
                System.out.println("Pokemon Red!!");
                break;
            default:
                System.out.println("Quase Boku no Hero saindo!");
                break;
        }

    }
}
