public class Sauce extends SubwayDecorator {
    public Sauce (Subway Sub) {
        super(Sub);
    }

    public String makeSub() {
        return super.makeSub() + this.decorateWithSauce();
    }

    public String decorateWithSauce() { 
        return "Saus\n";
    }

    public double cost() {
        return super.cost() + 0.05; 
    }

}
