public class Main {
    public static void main(String[] args) {
        int[] poang = {10, 20, 5, 50, 15};
        int sum = 0;

        Hjalte myHjalte = new Hjalte();

        for (int score : poang) {
            sum += score;
        }

        myHjalte.setPoang(sum);

        System.out.println(myHjalte.getPoang());
        
        System.out.println(myHjalte.highScore(poang));
    }
}
