import java.sql.SQLOutput;

public class Pizza
{
    private int price;
    private Boolean veg;

    private  int ExtracCheesePrice  = 100;
    private  int ExtraToppingPrice = 150;
    private  int BackPackPrice = 20;
    private  int basePizzaPrice = 0;
    private boolean isExtraCheeseAdded = false;
    private  boolean isExtraToppingAdded = false;
    private boolean isOptedForTake = false;


    public Pizza(Boolean veg) {
        this.veg = veg;

        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
       public void addExtraCheese()
       {
           isExtraCheeseAdded = true;
           this.price += ExtracCheesePrice;
       }
       public  void addExtraTopping()
       {
           isExtraToppingAdded = true;
           this.price += ExtraToppingPrice;
       }

       public  void TakeAway()
       {
           isOptedForTake = true;
           this.price += BackPackPrice;
       }
       public void getBill()
       {
           String bill = "";
           System.out.println("Pizza:"+basePizzaPrice);

           if(isExtraCheeseAdded)
           {
               bill += "Extra Cheese Added:"+ExtracCheesePrice+ "\n";
           }

           if(isExtraToppingAdded)
           {
               bill += "Extra Topping Added:"+ExtraToppingPrice+"\n";
           }
           if(isOptedForTake)
           {
               bill += "Take Away:"+BackPackPrice+"\n";
           }
           bill += "Bill:"+this.price+"\n";
           System.out.println(bill);
       }
}
