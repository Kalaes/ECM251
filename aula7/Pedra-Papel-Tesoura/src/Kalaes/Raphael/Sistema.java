package Kalaes.Raphael;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private Jogador player1;
    private Jogador player2;
    private Scanner scanner;
    private final Jogada [] jogadas = new Jogada[]{new Pedra(),new Papel(),new Tesoura()};

    public Sistema() {
        this.scanner = new Scanner(System.in);
        inicializaPlayers();
    }
    private void inicializaPlayers(){
        System.out.println("Informe seu nome:");
        String nome = scanner.next();
        this.player1 = new Jogador(nome,true);
        this.player2 = new Jogador("Cid");
    }
    public void run(){
        while (true){
            System.out.println(player1+' vs '+ player2);
            player1.setJogada(selecionaJogada());
            player2.setJogada(sortearJogada());
            System.out.println("Jogada:");
            System.out.println(player1+":"+ player1.getJogada());
            System.out.println(player2+":"player2.getJogada());
            System.out.printf("Resultado:"+player1.getJogada().verificaResultado(player2.getJogada()));
        }
        private Jogada sortearJogada(){
                        return jogadas[new Random().nextInt(jogadas.length)];
        }
    }
}
