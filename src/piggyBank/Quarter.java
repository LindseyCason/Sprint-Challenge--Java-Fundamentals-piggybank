package piggyBank;

public class Quarter extends AbstractCoins
{

    public Quarter(String name, int quantity){
        super(name, quantity);
    }

    @Override
    public double getValue(){
        return .25;
    }
    
    public double addCoins(){
        return getValue() *quantity;
    };
   
}





















// package piggyBank;

// public class Quarter extends AbstractCoins
// {
//     //don't need fields because they're in AbCoins

//     public Quarter(String name, double value, double addCoins, int quantity){
//         super(name, value, addCoins, quantity);
//     }

//     @Override
//     public double totalValueofCoins(double value, int coinQuantity) {
//         // multiply the number of coins in the jar by the value of the coin
//         //to get total value of the Quarters.
//         return value * coinQuantity;
//     }

//     @Override
//     public double getValue(){
//         return .01;
//     }

// }