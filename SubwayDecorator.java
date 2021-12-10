public class SubwayDecorator implements Subway {
    private Subway Sub;

    public SubwayDecorator(Subway Sub) {
        this.Sub = Sub;
    }

    @Override
    public String makeSub() {
        return Sub.makeSub();
    }

    @Override
    public double cost() {
        return Sub.cost();
    }
}
