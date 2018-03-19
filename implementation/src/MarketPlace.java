public class MarketPlace{
    private static MarketPlace instance = null;

    private MarketPlace(){
    }

    public static MarketPlace getInstance(){
        if (instance == null)
            instance = new MarketPlace();
        return instance;
    }

}
