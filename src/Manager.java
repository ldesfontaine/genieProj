/**
 * Classe représentant un manager.
 * Un manager utilise 3 feuilles de papier toilette.
 */
public class Manager implements User {

    /**
     * Utilise 3 feuilles de papier toilette.
     */
    @Override
    public void useToiletPaper() {
        ToiletPaperRoll.getInstance().usePaper(3);
    }
}