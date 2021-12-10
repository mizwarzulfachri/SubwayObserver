public class Pickle extends SubwayDecorator {
    public Pickle (Subway Sub) {
        super(Sub);
    }

    public String makeSub() {
        return super.makeSub() + this.decorateWithPickle();
    }

    public String decorateWithPickle() { 
        return "Acar\n";
    }

    public double cost() {
        return super.cost() + 0.10; 
    }
}
