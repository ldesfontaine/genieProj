/**
 * Classe représentant un stagiaire.
 * Le stagiaire n'ose pas utiliser le papier toilette.
 */
public class Intern implements User {

    /**
     * Affiche un message indiquant que le stagiaire n'utilise pas de papier toilette.
     */
    @Override
    public void useToiletPaper() {
        System.out.println("L'Intern n'ose pas utiliser le papier toilette.");
    }
}