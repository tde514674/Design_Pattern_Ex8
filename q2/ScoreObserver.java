public class ScoreObserver implements Observer {
    @Override
    public void update(Source o) {
        System.out.println("live result: "+((ScoreSource)o).getSomeData());
    }
}
