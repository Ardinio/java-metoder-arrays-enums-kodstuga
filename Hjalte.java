import java.util.Arrays;

public class Hjalte {
    private int poang;

    public int getPoang() {
        return poang;
    }

    public int setPoang(int poang) {
        return this.poang += poang;
    }

    int highScore(int[] scores) {
        Arrays.sort(scores);
        return scores[scores.length - 1];
    }
}
