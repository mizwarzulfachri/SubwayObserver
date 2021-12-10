public class Bread implements Subway {
    @Override
    public String makeSub() {
        return "Roti\n";
    }
    
    @Override
    public double cost() {
        return 0.80;
    }
}
