package piggyBank;

public class Penny extends AbstractCoins
{
    //don't need fields because they're in AbCoins

    public Penny(String name, int quantity){
        super(name, quantity);
    }

    // @Override
    // public double totalValueofCoins(double value, int coinQuantity) {
    //     // multiply the number of coins in the jar by the value of the coin
    //     //to get total value of the pennies.
    //     return value * coinQuantity;
    // }

    @Override
    public double getValue(){
        return .01;
    }
    
    public double addCoins(){
        return getValue() *quantity;
    };
   
}