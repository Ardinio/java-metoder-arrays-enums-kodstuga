import java.util.Arrays;

public class Findthetreasure {
    public static void main(String[] args) {
        int[] guld = {10, 50, 30, 95, 22};

        int alltGuld = raknaGuld(guld);
        int storGuld = hittaStorstaGuldet(guld);

        System.out.println(alltGuld);
        System.out.println(storGuld);
    }

    static int raknaGuld(int[] guld) {
        int sum = 0;
        for (int alltGuld : guld) {
            sum += alltGuld;
        }
        return sum;
    }

    static int hittaStorstaGuldet(int[] guld) {
        Arrays.sort(guld);
        return guld[guld.length - 1];
    }
}
