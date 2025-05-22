public class Employee implements User {
    @Override
    public void useToiletPaper() {
        ToiletPaperRoll.getInstance().usePaper(1);
    }
}