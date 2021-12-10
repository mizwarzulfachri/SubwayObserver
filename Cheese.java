public class Cheese extends SubwayDecorator {
    public Cheese (Subway Sub) {
        super(Sub);
    }

    public String makeSub() {
        return super.makeSub() + this.decorateWithCheese();
    }

    public String decorateWithCheese() { 
        return "Keju\n";
    }

    public double cost() {
        return super.cost() + 0.50; 
    }

}
