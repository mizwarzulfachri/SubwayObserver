public class Tomato extends SubwayDecorator {
    public Tomato (Subway Sub) {
        super(Sub);
    }

    public String makeSub() {
        return super.makeSub() + this.decorateWithTomato();
    }

    public String decorateWithTomato() { 
        return "Tomat\n";
    }

    public double cost() {
        return super.cost() + 0.10; 
    }

}
