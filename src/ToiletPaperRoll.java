public class ToiletPaperRoll {
    private static ToiletPaperRoll instance;
    private int stock = 100;

    private ToiletPaperRoll() {
    }

    public static ToiletPaperRoll getInstance() {
        if (instance == null) {
            instance = new ToiletPaperRoll();
        }
        return instance;
    }

    public void usePaper(int amount) {
        if (stock >= amount) {
            stock -= amount;
            System.out.println(amount + " feuille(s) utilisée(s). Stock restant : " + stock);
        } else {
            System.out.println("Pas assez de papier ! Stock restant : " + stock);
        }
    }
}