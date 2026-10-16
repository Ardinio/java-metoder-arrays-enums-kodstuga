public class Robot {
    public static void main(String[] args) {
        String Ardino = halsa("Ardino");
        String Messmer = halsa("Messmer");

        System.out.println(Ardino);
        System.out.println(Messmer);
    }

    static String halsa(String name) {
        return "Hej " + name + "! Jag är en robot!";
    }
}