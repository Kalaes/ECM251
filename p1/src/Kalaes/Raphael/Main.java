package Kalaes.Raphael;

public class Prova {

    public static void main(String[] args) {
        int valor = calcular(new int [] {6,8,9,2}, new int[]{6,2,4});
        System.out.print(valor);
    }

    publica static int calcular( int[] vl, int[] v2) {
        int t;
        if (vl.length > v2.length){
            t = vl.length;
        } else {
            t = v2.length;
        }
        int r = 0;
        for (int i=0; i < t; i++){
            r += vl[i] * v2[i];
        }
        return r;
    }
}
