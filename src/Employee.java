/**
 * Classe représentant un enployé.
 * Un manager utilise 1 feuille de papier toilette.
 */
public class Employee implements User {
    
    /**
     * Utilise 3 feuilles de papier toilette.
     */
    @Override
    public void useToiletPaper() {
        ToiletPaperRoll.getInstance().usePaper(1);
    }
}