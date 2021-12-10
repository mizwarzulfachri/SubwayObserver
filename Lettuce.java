public class Lettuce extends SubwayDecorator {
    public Lettuce (Subway Sub) {
        super(Sub);
    }

    public String makeSub() {
        return super.makeSub() + this.decorateWithLettuce();
    }

    public String decorateWithLettuce() {  
        return "Selada\n";
    }

    public double cost() {
        return super.cost() + 0.10; 
    }
}
