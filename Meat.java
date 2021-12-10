public class Meat extends SubwayDecorator {
    public Meat(Subway Sub) {
        super(Sub);
    }

    public String makeSub() {
        return super.makeSub() + this.decorateWithMeat();
    }

    public String decorateWithMeat() {
        return "Daging\n";
    }

    public double cost() {
        return super.cost() + 1.00; 
    }
}
