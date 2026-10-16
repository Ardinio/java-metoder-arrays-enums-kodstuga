public class Dreamteam {
    public static void main(String[] args) {
        String[] lagSpelare = {"Adam", "Zeus", "Jesus", "Hercules", "Susano"};

        System.out.println(lagSpelare[0] + " " + (lagSpelare[lagSpelare.length - 1]));

        lagSpelare[2] = "Messmer";

        for (int i = 0; i < lagSpelare.length; i++) {
            System.out.println(lagSpelare[i]);
        }

        System.out.println(lagSpelare.length);

        for (String spelare : lagSpelare) {
            System.out.println(spelare);
        }
    }
}
