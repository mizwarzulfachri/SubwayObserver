public class Cucumber extends SubwayDecorator {
    public Cucumber (Subway Sub) {
        super(Sub);
    }

    public String makeSub() {
        return super.makeSub() + this.decorateWithCucumber();
    }

    public String decorateWithCucumber() { 
        return "Ketimun\n";
    }

    public double cost() {
        return super.cost() + 0.10; 
    }
}
