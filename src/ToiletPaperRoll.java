/**
 * Classe représentant un rouleau de papier toilette.
 */
public class ToiletPaperRoll {

    private static ToiletPaperRoll instance;
    private int stock = 100;

    /**
     * Constructeur privé pour empêcher l'instanciation directe (Singleton).
     */
    private ToiletPaperRoll() {
    }

    /**
     * Retourne l'unique instance de ToiletPaperRoll.
     *
     * @return l'instance unique de ToiletPaperRoll
     */
    public static ToiletPaperRoll getInstance() {
        if (instance == null) {
            instance = new ToiletPaperRoll();
        }
        return instance;
    }

    /**
     * Utilise une certaine quantité de papier toilette si le stock le permet.
     *
     * @param amount le nombre de feuilles à utiliser
     */
    public void usePaper(int amount) {
        if (stock >= amount) {
            stock -= amount;
            System.out.println(amount + " feuille(s) utilisée(s). Stock restant : " + stock);
        } else {
            System.out.println("Pas assez de papier ! Stock restant : " + stock);
        }
    }
}