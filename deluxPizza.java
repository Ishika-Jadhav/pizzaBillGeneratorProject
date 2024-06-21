public class deluxPizza extends Pizza{

    public deluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopping();

    }

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraTopping() {}
}
