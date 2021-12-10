public class Onion extends SubwayDecorator {
    public Onion (Subway Sub) {
        super(Sub);
    }

    public String makeSub() {
        return super.makeSub() + this.decorateWithOnion();
    }

    public String decorateWithOnion() { 
        return "Bawang Merah\n";
    }

    public double cost() {
        return super.cost() + 0.10; 
    }
}
