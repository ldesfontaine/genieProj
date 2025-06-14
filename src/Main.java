/**
 * Classe principale du programme.
 * Crée différents types d'utilisateurs et appelle leur méthode d'utilisation du papier toilette.
 */
public class Main {
    public static void main(String[] args) {
        UserFactory factory = new UserFactory();

        User employee = factory.createUser("employee");
        User manager = factory.createUser("manager");
        User intern = factory.createUser("intern");

        employee.useToiletPaper();
        manager.useToiletPaper();
        intern.useToiletPaper();
    }
}