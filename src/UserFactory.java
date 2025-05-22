public class UserFactory {
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