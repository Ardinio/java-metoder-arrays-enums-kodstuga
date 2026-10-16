public class Superkrafter {
    public static void main(String[] args) {
        Superkraft mySuperkraft = Superkraft.ELD;

        switch (mySuperkraft) {
            case ELD:
                    System.out.println("Du har kraften av eld.");
                break;

            case IS:
                    System.out.println("Du har kraften av is");
                break;

            case VIND:
                    System.out.println("Du har kraften av vind");
                break;

            case BLIXT:
                    System.out.println("Du har kraften av blixt");
                break;

            default:
                break;
        }

        for (Superkraft krafter: Superkraft.values()) {
            System.out.println(krafter);
        }
        
    }

    public enum Superkraft {
        ELD,
        IS,
        VIND,
        BLIXT
    }
}
