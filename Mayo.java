public class Mayo extends SubwayDecorator {
    public Mayo (Subway Sub) {
        super(Sub);
    }

    public String makeSub() {
        return super.makeSub() + this.decorateWithMayo();
    }

    public String decorateWithMayo() { 
        return "Mayones\n";
    }

    public double cost() {
        return super.cost() + 0.05; 
    }

}
