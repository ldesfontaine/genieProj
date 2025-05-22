public class Manager implements User {
    @Override
    public void useToiletPaper() {
        ToiletPaperRoll.getInstance().usePaper(3);
    }
}