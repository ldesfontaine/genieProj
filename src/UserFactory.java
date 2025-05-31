/**
 * La classe UserFactory permet de créer des utilisateurs de différents types
 * (Employee, Manager, Intern) en fonction d'une chaîne de caractères.
 */
public class UserFactory {

    /**
     * Crée une instance d'utilisateur selon le type spécifié.
     *
     * @param type le type d'utilisateur à créer ("employee", "manager", "intern")
     * @return une instance d'un utilisateur correspondant au type
     * @throws IllegalArgumentException si le type est inconnu
     */
    public User createUser(String type) {
        switch (type.toLowerCase()) {
            case "employee":
                return new Employee();
            case "manager":
                return new Manager();
            case "intern":
                return new Intern();
            default:
                throw new IllegalArgumentException("Type d'utilisateur inconnu : " + type);
        }
    }
}