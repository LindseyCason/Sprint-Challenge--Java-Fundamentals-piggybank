package piggyBank;

public class Nickel extends AbstractCoins
{

    public Nickel(String name, int quantity){
        super(name, quantity);
    }

    @Override
    public double getValue(){
        return .05;
    }
    
    public double addCoins(){
        return getValue() *quantity;
    };
   
}