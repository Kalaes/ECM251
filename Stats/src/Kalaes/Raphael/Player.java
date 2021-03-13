package Kalaes.Raphael;

public class Player {
    String name;
    int kills;
    int assists;
    int deaths;
    int wins;
    int losses;
    double kd;


    @Override
    public String toString() {
        return "{" +
                "  name  : '" + name + '\'' +
                ",  kills :" + kills +
                ", assists: " + assists +
                ", deaths: " + deaths +
                ", wins: " + wins +
                ", losses: " + losses +
                ",kd: " + kd +
                " },";
    }
}
