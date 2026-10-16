public class Godisrakning {
    public static void main(String[] args) {
        int godisButik = raknaPris(4, 10);
        int godisButik2 = raknaPris(8, 25);

        int godisButik3 = raknaPris(12);

        System.out.println(godisButik);
        System.out.println(godisButik2);

        System.out.println(godisButik3);
    }

    static int raknaPris(int godis, int pris) {
        int total = godis * pris;
        return total;
    }

    static int raknaPris(int godis) {
        int total = godis * 2;
        return total;
    }
}