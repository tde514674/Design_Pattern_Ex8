public class ScoreSource extends Source {
   
    private String someData;

    public void setSomeData(String aData) {
        someData = aData;
        notifyObservers();
    }
    public String getSomeData() {
	    return someData;
    }
    
}
